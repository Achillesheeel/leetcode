
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
 * @Date : 2020/6/8
 *
 */


public class s1_007_Reverse_Integer {
    public int reverse(int x) {
        int ans = 0;
        while(x!=0){
            if(ans>Integer.MAX_VALUE/10||ans<Integer.MIN_VALUE/10){
                return 0;
            }
            if((ans==Integer.MAX_VALUE/10&&x%10>7)||(ans==Integer.MIN_VALUE/10&&x%10<-8)){
                return 0;
            }
            ans = ans * 10 + (x%10);
            x /=10;
        }
        return ans;
    }
}
