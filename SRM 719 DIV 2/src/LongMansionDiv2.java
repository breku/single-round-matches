import java.util.Arrays;

public class LongMansionDiv2 {

	public long minimalTime(int M, int[] t) {
		final long[] sum = {0};
		Arrays.stream(t).boxed().forEach(x -> sum[0] += x);
		Arrays.sort(t);
		return ((long)M - 1) * (long)t[0] + (long)sum[0];
	}
}
