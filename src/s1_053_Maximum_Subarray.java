
/*
 * Copyright 2017 SAIC General Motors Corporation Ltd. All Rights Reserved.
 *
 * This software is published under the terms of the SGM Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 * @Project Name : leetcode
 *
 * @Author : wxz
 *
 * @Date : 2020/6/4
 *
 */


public class s1_053_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        return maxArray(0,nums.length-1,nums);
    }

    private int maxArray(int l,int r,int[] nums){
        if(l==r){
            return nums[l];
        }
        int m = (l+r)/2;
        int lMax = maxArray(l,m,nums);
        int rMax = maxArray(m+1,r,nums);
        int crossMax = nums[m];
        int curMax = nums[m];
        for(int i=m-1;i>=l;i--){
            curMax += nums[i];
            if(crossMax<curMax){
                crossMax = curMax;
            }
        }
        curMax = crossMax;
        for(int j=m+1;j<=r;j++){
            curMax += nums[j];
            if(curMax>crossMax){
                crossMax = curMax;
            }
        }

        return Math.max(crossMax,Math.max(lMax,rMax));
    }

    public int maxSubArrayDP(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
