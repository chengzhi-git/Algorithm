package com.chengzhi;

import java.util.ArrayList;

/**
 * @Author:chengzhi
 * @Date:2020/8/29 15:12
 * @Description
 */
public class Test {
 public static void print(int num){
     for (int i = 31; i >= 0; i--) {
         System.out.print((num & (1 << i)) == 0 ? 0 : 1);
     }
 }

    public static void main(String[] args) {
//        print(-2);
//        System.out.println();
//        print(-Integer.MAX_VALUE);
//        System.out.println();;
//        print(Integer.MIN_VALUE);
//        System.out.println();
//        print(Integer.MIN_VALUE);
        print(Integer.MAX_VALUE-1);

    }
}