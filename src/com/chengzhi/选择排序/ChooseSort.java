package com.chengzhi.选择排序;

import java.util.jar.JarEntry;

/**
 * @Author:chengzhi
 * @Date:2021/6/26 11:43
 * @Description
 */
public class ChooseSort {
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }
    }

    public static void bubble(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j + 1, j);
                }
            }
        }
    }

    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            while (i - 1 >= 0 && arr[i] < arr[i - 1]){
                swap(arr,i,i - 1);
                i --;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = 0;
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        //selectSort(arr);
        bubble(arr);
        //insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
