package com.jasper;

import java.util.Arrays;

/**
 * 连续比较相邻的俩个元素 如果左边大于右边，则交换俩者 遍历完一遍之后最大的元素会到最右边（浮出水面）
 * 然后在比较剩余的元素（排除最大的元素）
 *  大的气泡更容易浮出水面
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 3, 4 };
//        bubbleSort(arr);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
        bubbleSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for (int i = arr.length -1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void bubbleSort1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if (arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序优化  当输入数组有序时 time complexity  O(n*n) -> O(n)
     * @param arr array
     */
    public static void bubbleSortWithFlag(int[] arr){
        boolean flag = false;
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
//            假如一次也没有交换，则直接跳出外层循环 不继续后续的比较
            if (!flag){
                break;
            }
        }
    }
}

