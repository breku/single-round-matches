import java.util.*;
import java.math.*;
import java.util.stream.Collectors;

import static java.lang.Math.*;

public class DistinctGridEasy {
	
	public String checkGrid(int n, int k, int[] grid) {


		for (int i = 0; i < n; i++) {
			final int[] ints = Arrays.copyOfRange(grid, i * n, i * n + n);

			final List<Integer> collect = Arrays.stream(ints).boxed().collect(Collectors.toList());
			Set<Integer> set = new HashSet<>(collect);
			if(set.size() <k){
				return "Bad";
			}

		}
		return "Good";
	}
}
