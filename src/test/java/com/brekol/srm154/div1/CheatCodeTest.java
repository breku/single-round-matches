package com.brekol.srm154.div1;



import org.fest.assertions.Assertions;
import org.junit.Test;

public class CheatCodeTest {

    private CheatCode uut = new CheatCode();

    @Test
    public void test0() {
        // when
        final int[] result = uut.matches( "UUDDLRRLLRBASS", new String[] {"UUDDLRLRBA","UUDUDLRLRABABSS","DDUURLRLAB","UUDDLRLRBASS","UDLRRLLRBASS"});

        // then
        Assertions.assertThat(result).isEqualTo(new int[] { 0, 3, 4 });
    }

    @Test
    public void test1() {
        // when
        final int[] result = uut.matches( "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", new String[] {"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"});

        // then
        Assertions.assertThat(result).isEqualTo(new int[] { 0 });
    }

    @Test
    public void test2() {
        // when
        final int[] result = uut.matches( "IDDQDDTSFHHALL", new String[] {"FHHALL", "FHSHH", "IDBEHOLDA", "IDBEHOLDI", "IDBEHOLDL","IDBEHOLDR", "IDBEHOLDS", "IDBEHOLDV", "IDCHOPPERS", "IDCLEV","IDCLIP", "IDDQD", "IDDT", "IDFA", "IDKFA", "IDMYPOS", "IDMUS"});

        // then
        Assertions.assertThat(result).isEqualTo(new int[] { 0, 11 });
    }

    @Test
    public void test3() {
        // when
        final int[] result = uut.matches( "AABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVWWXXYY", new String[] {"ABCDE", "BCDEF", "CDEFG", "DEFGH", "EFGHI","FGHIJ", "GHIJK", "HIJKL", "IJKLM", "JKLMN","KLMNO", "LMNOP", "MNOPQ", "NOPQR", "OPQRS","PQRST", "QRSTU", "RSTUV", "STUVW", "TUVWX","UVWXY", "VWXYZ", "WXYZA", "XYZAB", "YZABC","ZABCD"});

        // then
        Assertions.assertThat(result).isEqualTo(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16, 17, 18, 19, 20 });
    }

}
