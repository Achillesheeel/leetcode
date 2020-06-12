
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


public class s1_066_Plus_One {
    public int[] plusOne(int[] digits) {
        if(digits.length==1&&digits[0]==0){
            return new int[]{1};
        }
        int len = digits.length;
        int carry = 1;
        for(int i=len-1;i>=0;i--){
            digits[i]=digits[i]+carry;
            if(digits[i]>9){
                carry = digits[i]/10;
                digits[i] = digits[i]%10;
            }else {
                carry = 0;
            }
        }
        if(carry!=0){
            int[] ans = new int[len+1];
            ans[0]=carry;
            for(int j=0;j<len;j++){
                ans[j+1] = digits[j];
            }
            return ans;
        }
        return digits;
    }
}
