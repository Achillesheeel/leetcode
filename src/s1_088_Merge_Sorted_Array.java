
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
 * @Date : 2020/6/9
 *
 */


public class s1_088_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int endIndex = m+n-1;
        while(j>=0){
            if(i>=0){
                nums1[endIndex--] = nums1[i]< nums2[j] ? nums2[j--]:nums1[i--];
            }else{
                nums1[endIndex--] = nums2[j--];
            }
        }
    }
}
