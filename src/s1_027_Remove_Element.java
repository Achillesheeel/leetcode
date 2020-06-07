
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


public class s1_027_Remove_Element {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int ind = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[ind]=nums[i];
                ind++;
            }
        }
        return ind;
    }
}
