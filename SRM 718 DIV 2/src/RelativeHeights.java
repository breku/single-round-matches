import java.util.*;

public class RelativeHeights {

	public int countWays(int[] h) {

		List<List<Integer>> results = new ArrayList<>();
		for (int i = 0; i < h.length; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < h.length; j++) {
				if (i != j) {
					list.add(h[j]);
				}
			}
			results.add(list);
		}

		Set<List<Integer>> profiles = transformLists(results);


		return profiles.size();
	}

	private Set<List<Integer>> transformLists(List<List<Integer>> results) {
		Set<List<Integer>> set = new HashSet<>();
		for (List<Integer> result : results) {
			set.add(transformList(result));
		}
		return set;
	}

	private List<Integer> transformList(List<Integer> list) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			int profile = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					profile++;
				}
			}
			result.add(profile);
		}
		return result;
	}
}
