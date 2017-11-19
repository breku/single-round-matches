#!/usr/bin/env bash

INPUT_FILE=$1
PACKAGE_NAME=$2
declare -A FILE_LINES
declare -A EXPECTED_ARRAY
declare -A INPUT_PARAMS_ARRAY
declare -A PARAMETER_TYPES_ARRAY

OUTPUT_TEST_FILE_NAME="test.txt"
OUTPUT_CLASS_FILE_NAME="class.txt"

function readFile {
	COUNTER=0
	while read p; do
	  FILE_LINES[$COUNTER]=$p
	  COUNTER=$(( $COUNTER + 1 ))
	done <$INPUT_FILE
}

function init {
    echo > $OUTPUT_TEST_FILE_NAME
    echo > $OUTPUT_CLASS_FILE_NAME

    if [ "x${PACKAGE_NAME}" = "x" ]; then
        PACKAGE_NAME="srm"
    fi
}

function appendToTest {
    text=$1
    echo -e $text >> $OUTPUT_TEST_FILE_NAME
}

function appendToClass {
    text=$1
    echo -e $text >> $OUTPUT_CLASS_FILE_NAME
}

function createHeadline {
    appendToTest ""
    appendToTest "package com.brekol.$PACKAGE_NAME;"
    appendToTest "import org.fest.assertions.Assertions;"
    appendToTest "import org.junit.Test;"
}

function initDescription {

    LENGTH=${#FILE_LINES[@]}
    NUMBER_OF_EXAMPLES=0
    for  (( i=1; i<${LENGTH}+1; i++ ));
    do
        if [ "${FILE_LINES[$i]}" = "Class:" ]; then
               CLASS_NAME="${FILE_LINES[$(($i+1))]}"
        fi

        if [ "${FILE_LINES[$i]}" = "Method:" ]; then
               METHOD="${FILE_LINES[$(($i+1))]}"
        fi

        if [ "${FILE_LINES[$i]}" = "Method signature:" ]; then
               METHOD_SIGNATURE="${FILE_LINES[$(($i+1))]}"
        fi



        if [ "${FILE_LINES[$i]}" = "Parameters:" ]; then
               PARAMETERS="${FILE_LINES[$(($i+1))]}"
               NUMBER_OF_PARAMETERS=`echo $PARAMETERS | wc -w`
               PARAMETERS_ARRAY_TEMP=`echo $PARAMETERS | tr -d '[:space:]' | sed -e 's/,/\n/g'`


               COUNTER1=0
               for p in $PARAMETERS_ARRAY_TEMP;
               do
                    PARAMETER_TYPES_ARRAY[$COUNTER1]="$p"
                    COUNTER1=$(( $COUNTER1 + 1 ))
               done

               RETURN_TYPE="${FILE_LINES[$(($i+3))]}"
        fi


        if [ "${FILE_LINES[$i]}" = "Examples" ]; then
            for  (( j=$i; j<${LENGTH}+1; j++ ));
            do
                if [[ "${FILE_LINES[$j]}" == "Returns:"* ]]; then
                    EXPECTED_ARRAY[$NUMBER_OF_EXAMPLES]=`echo "${FILE_LINES[$j]}" | sed -e 's/Returns: \(.*\)/\1/'`
                    NUMBER_OF_EXAMPLES=$(($NUMBER_OF_EXAMPLES+1))
                fi

                if [[ "${FILE_LINES[$j]}" == "$NUMBER_OF_EXAMPLES)" ]]; then
                COUNTER=$(($j+1))
                INPUT_PARAMS_COUNTER=0
                while true
                do
                    if [[ "${FILE_LINES[$COUNTER]}" == "Returns:"* ]]; then
                        break
                    fi
                    if [[ "${FILE_LINES[$COUNTER]}" =~ [[:digit:]]+|\" ]]; then
                        INPUT_PARAMS_ARRAY[$NUMBER_OF_EXAMPLES,$INPUT_PARAMS_COUNTER]=${FILE_LINES[$COUNTER]}
                        INPUT_PARAMS_COUNTER=$(( $INPUT_PARAMS_COUNTER + 1 ))
                    fi
                    COUNTER=$(( $COUNTER + 1 ))
                done
                fi
            done
        fi


    done

}

function createTestCases {

    for i in `seq 0 $(($NUMBER_OF_EXAMPLES-1))`;
    do
        appendToTest "\t@Test"
        appendToTest "\tpublic void test$i() {"
        appendToTest "\t\t// when"

        t1="\t\tfinal $RETURN_TYPE result = uut.$METHOD("
        params=""
        for  (( j=0; j<${NUMBER_OF_PARAMETERS}; j++ ));
        do

            if [[ "${PARAMETER_TYPES_ARRAY[$j]}" == *"[]" ]]; then
                params="$params new ${PARAMETER_TYPES_ARRAY[$j]} ${INPUT_PARAMS_ARRAY[$i,$j]}"
            else
                params="$params ${INPUT_PARAMS_ARRAY[$i,$j]}"
            fi

            if [[ "$j" != $(($NUMBER_OF_PARAMETERS -1 )) ]]; then
                params="$params, "
            else
                params="$params);"
            fi

        done
        appendToTest "$t1 $params"


        appendToTest ""
        appendToTest "\t\t// then"
        if [[ "$RETURN_TYPE" == *"[]" ]]; then
            appendToTest "\t\tAssertions.assertThat(result).isEqualTo(new $RETURN_TYPE ${EXPECTED_ARRAY[$i]});"
        else
            appendToTest "\t\tAssertions.assertThat(result).isEqualTo(${EXPECTED_ARRAY[$i]});"
        fi



        appendToTest "\t}"
        appendToTest ""
    done

}

function createActualJavaFiles {
    local DEST_CLASS_DIR="src/main/java/com/brekol/$PACKAGE_NAME"
    local DEST_TEST_CLASS_DIR="src/test/java/com/brekol/$PACKAGE_NAME"
    mkdir -p $DEST_CLASS_DIR $DEST_TEST_CLASS_DIR
    cp $OUTPUT_CLASS_FILE_NAME "$DEST_CLASS_DIR/$CLASS_NAME.java"
    cp $OUTPUT_TEST_FILE_NAME "$DEST_TEST_CLASS_DIR/${CLASS_NAME}Test.java"

}

function createClass {
    appendToClass ""
    appendToClass "package com.brekol.$PACKAGE_NAME;"
    appendToClass ""
    appendToClass "import java.util.*;"
    appendToClass "import java.util.regex.*;"
    appendToClass "import java.text.*;"
    appendToClass "import java.math.*;"
    appendToClass "import java.awt.geom.*;"
    appendToClass "import java.util.*;"
    appendToClass ""
    appendToClass "public class ${CLASS_NAME} {"
    appendToClass ""
    appendToClass "\tpublic $METHOD_SIGNATURE {"
    appendToClass "\t return null;"
    appendToClass "\t}"
    appendToClass "}"




}

function createTestClass {
    createHeadline
    appendToTest ""
    appendToTest "public class ${CLASS_NAME}Test {"
    appendToTest ""
    appendToTest "\tprivate ${CLASS_NAME} uut = new ${CLASS_NAME}();"
    appendToTest ""
    createTestCases
    appendToTest "}"

}

init
readFile


initDescription
createTestClass
createClass
createActualJavaFiles