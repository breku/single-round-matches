package com.brekol.srm722;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by breku on 18.11.17.
 */
public class TCPhoneHomeEasy {

	public int validNumbers(int digits, String[] specialPrefixes)
	{
		final List<Integer> prefixesLengths = Arrays.stream(specialPrefixes).map(String::length).collect(Collectors.toList());
		int result = (int) Math.pow(10,digits);
		for (Integer prefixesLength : prefixesLengths) {
			result = result - (int)Math.pow(10,digits-prefixesLength);
		}
		return result;

	}

}
