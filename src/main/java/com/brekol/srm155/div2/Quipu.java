package com.brekol.srm155.div2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by brekol on 11.12.16.
 */
public class Quipu {

    public int readKnots(String knots) {
        final String[] xArray = knots.substring(1).split("-+");
        final List<String> minusList = Arrays.stream(knots.split("X")).filter(x -> x.contains("--")).collect(Collectors.toList());
        final Iterator<String> it = minusList.iterator();

        String result = "";
        for (int i = 0; i < xArray.length; i++) {
            result += xArray[i].length();
            if(it.hasNext()){
                result += getZeros(it.next().length() - 1);
            }
        }


        return Integer.valueOf(result);
    }

    private String getZeros(int i) {
        String result = "";
        for (int j = 0; j < i; j++) {
            result += "0";
        }
        return result;
    }

}
