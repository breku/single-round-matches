import java.util.ArrayList;
import java.util.List;

public class InterleavingParenthesisDiv2 {

	List<String> ways = new ArrayList<>();

	public int countWays(String s1, String s2) {


		char[] str = new char[s1.length() * s2.length()];
		getWays(s1.toCharArray(), s2.toCharArray(), str, 0, 0, 0);
		int res = 0;
		for (String way : ways) {
			if(isCorrect(way)){
				res++;
			}
		}

		return res;
	}

	void getWays(char[] s1, char[] s2, char[] str, int position, int start1, int start2) {
		if (position == s1.length + s2.length) {
			ways.add(new String(str));
		}
		if (start1 < s1.length) {
			str[position] = s1[start1];
			getWays(s1, s2, str, position + 1, start1 + 1, start2);
		}

		if (start2 < s2.length) {
			str[position] = s2[start2];
			getWays(s1, s2, str, position + 1, start1, start2 + 1);
		}

	}

	boolean isCorrect(String s) {
		if ("".equals(s.trim())) {
			return true;
		} else if (s.length() > 1 && s.contains("()")) {
			final int idx = s.indexOf("()");
			String newString = s.substring(0, idx) + s.substring(idx + 2, s.length());
			return isCorrect(newString);
		} else {
			return false;
		}
	}
}
