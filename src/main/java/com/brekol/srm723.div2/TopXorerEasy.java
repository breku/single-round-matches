

package com.brekol.srm723.div2;


import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;
import java.util.*;

public class TopXorerEasy {

	public int maximalRating(int A, int B, int C) {

		int[] array = new int[]{A,B,C};
		Arrays.sort(array);
		final String a = Integer.toString(array[2], 2);
		String b = Integer.toString(array[1],2);
		String c = Integer.toString(array[0],2);

		final int maxLength = a.length();
		while (b.length()<maxLength){
			b="0"+b;
		}
		while (c.length()<maxLength){
			c="0"+c;
		}

		String result ="";
		boolean x = false;
		for (int i = 0; i < a.length(); i++) {
			final char c1 = a.charAt(i);
			final char c2 = b.charAt(i);
			final char c3 = c.charAt(i);
			char[] chars = new char[]{c1,c2,c3};
			Arrays.sort(chars);
			final String s = new String(chars);
			if(s.contains("11")){
				x= true;
			}

			if(s.contains("1")|| x){
				result+="1";
			}else {
				result+="0";
			}

		}

		return Integer.parseInt(result,2);

	}
}
