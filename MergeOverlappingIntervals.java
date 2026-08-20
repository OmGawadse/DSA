// 70. Merge Overlapping Intervals
// Leetcode: 56
// Time Complexity: O(n log n), Space Complexity: O(1)

import java.util.*;

public class MergeOverlappingIntervals {

    public static int[][] OptimalApproach(int[][] intervals) {

        int n = intervals.length;

        List<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // This is the way of sorting a 2D array in Java.

        int start = intervals[0][0];  // Starting Value of 1st subarray/ interval.
        int end = intervals[0][1];   // Ending value of 1st subarray/ interval.

        for (int i = 1; i < n; i++) {

            if (intervals[i][0] <= end) {
                // current start <= previous end, of Overlapping happens. what about the ending part/value ?
                // Lets check about the ending part: 
                end = Math.max(end, intervals[i][1]); //if greater that previous end, Simply update it.
            }

            else {
                // No overlap → So it can be a new Interval -> store the current interval.
                ans.add(new int[] {start, end});

                start = intervals[i][0];      // Update the Start & End to Start a new interval.
                end = intervals[i][1];
            }
        }
        // Add the last interval to the answer list bcoz there is no next interval to check for overlap.
        ans.add(new int[] {start, end});

        // Convert my List of integer arrays into a 2D integer array
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 5},
            {7, 9},
            {8, 11},
            {15, 18},
            {121, 237}
        };

        int[][] result = OptimalApproach(intervals);

        // Print the result
        for (int[] interval : result) {
            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}