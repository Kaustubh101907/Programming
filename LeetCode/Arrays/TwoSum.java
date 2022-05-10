package LeetCode.Arrays;

import java.util.Arrays;

// Que Link: https://leetcode.com/problems/two-sum/

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[]nums, int target) {
        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target)
                    return new int[] {i, j};
            }
        }
        return new int[] {-1, -1};
    }
}
