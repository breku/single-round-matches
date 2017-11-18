package com.brekol.srm722;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by breku on 18.11.17.
 */
public class HillClimber {

	public int longest(int[] height) {
		int max = 0;
		List<Integer> maxes = new ArrayList<>();
		maxes.add(max);
		for (int i = 0; i < height.length - 1; i++) {
			int a = height[i];
			int b = height[i + 1];
			if (b > a) {
				max++;
				maxes.add(max);
			} else {
				max = 0;
			}
		}
		return Collections.max(maxes);


	}
}
