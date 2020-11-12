package com.emmanouil;

public class maximum_subarray {
    public static int maxSubArray(int[] nums){
        int n = nums.length;
        int curr = nums[0];
        int max = nums[0];

        for(int i = 0; i < n; i++){
            curr = Math.max(nums[i], nums[i] + curr);
            max = Math.max(curr, max);
        }

        return max;
    }

}
