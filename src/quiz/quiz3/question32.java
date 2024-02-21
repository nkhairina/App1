package quiz.quiz3;

public class question32 {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE; // Initialize max sum to negative infinity
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]); // Choose the larger of current element or current sum
                                                                  // + current element
            maxSum = Math.max(maxSum, currentSum); // Update max sum if necessary
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
