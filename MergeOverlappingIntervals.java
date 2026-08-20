// 70. Merge Overlapping Intervals
// Leetcode: 56
import java.util.*;

public class MergeOverlappingIntervals {

    public static int[][] OptimalApproach(int[][] intervals) {

        int n = intervals.length;

        List<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < n; i++) {

            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                ans.add(new int[] {start, end});

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        ans.add(new int[] {start, end});

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = OptimalApproach(intervals);

        for (int[] interval : result) {
            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}