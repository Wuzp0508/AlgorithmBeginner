package DailyProblems;

/**
 * 2145. Count the Hidden Sequences
 */

class Solution2145 {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long min = 0, max = 0;
        long sum = 0;
        for (int x : differences) {
            sum += x;
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }
        System.out.println(min + " " + max);
        return upper - lower >= max - min ? (int)((upper - lower) - (max - min) + 1) : 0;
    }
}

public class Daily2145 {
    public static void main(String[] args) {
        Solution2145 solution = new Solution2145();
        System.out.println(solution.numberOfArrays(new int[]{1, 2, 3, 4, 5}, 2, 4));
    }
}
