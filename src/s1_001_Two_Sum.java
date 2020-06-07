
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


import java.util.HashMap;

public class s1_001_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                return new int[]{mp.get(target-nums[i]),i};
            }
            mp.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution!");
    }
}
