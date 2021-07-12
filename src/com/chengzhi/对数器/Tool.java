package com.chengzhi.对数器;

import com.chengzhi.选择排序.ChooseSort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/**
 * @Author:chengzhi
 * @Date:2021/7/12 21:57
 * @Description
 */
public class Tool {
    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            ChooseSort.selectSort(arr1);
            comparator(arr2);
            if(!isEqual(arr1,arr2)) {
                succeed = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking Fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        ChooseSort.selectSort(arr);
        printArray(arr);
    }
    public static int[] generateRandomArray(int maxSize,int maxValue){
        //Math.random() [0,1) 等概率返回小数
        //Math.random() * N [0,N)
        //(int)(Math.random() * N) [0,N-1]
        int[] arr =new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            //正数和负数
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());

        }
        return arr;
    }

    public static int[] copyArray(int[] arr){
        if(arr == null){
            return arr;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static void comparator(int[] arr){
        Arrays.sort(arr);
    }

    public static boolean isEqual(int[] arr1, int[] arr2){
        if((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) return false;

        if(arr1 ==null && arr2 ==null) return true;

        if(arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1)  System.out.print(arr[i]);
            else System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }
}
