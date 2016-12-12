package com.brekol.srm156.div2;

import java.util.*;

/**
 * Created by brekol on 12.12.16.
 */
public class DiskSpace {

    public int minDrives(int[] used, int[] total) {

        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < used.length; i++) {
            pairs.add(new Pair(used[i], total[i]));
        }

        int usedSum = Arrays.stream(used).mapToObj(Integer::valueOf).mapToInt(Integer::valueOf).sum();
        Collections.sort(pairs);
        final Iterator<Pair> iterator = pairs.iterator();

        int result = 0;

        while (usedSum > 0) {
            final Pair pair = iterator.next();
            usedSum -= pair.total;
            result++;
        }
        return result;
    }


    private class Pair implements Comparable<Pair> {
        int used;
        int total;

        public Pair(int used, int total) {
            this.used = used;
            this.total = total;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.total > o.total) {
                return -1;
            } else if (this.total < o.total) {
                return 1;
            }
            return 0;
        }
    }

}
