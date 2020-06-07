
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


public class s1_026_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int len = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                nums[len]=nums[i+1];
                len++;
            }
        }
        return len;
    }
}
