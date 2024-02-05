package com.jasper;

import java.util.Arrays;

/**
 * quickSort 基于分治策略
 * 哨兵划分 选中数组中的某个元素为基准数，小于基准数的移动到左侧，大于基准数的移到右侧
 * 实质就是将一个较长的数组的排序问题划分为较短的俩个数组的排序问题
 */
public class QuickSort {
    public static void main(String[] args) {
            int[] arr = {1,5,6,3,2,4,9,3};
            quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    static void swap(int[] arr,int i,int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int i, int j){
        if (i < j){
            int partition = partition(arr, i, j);
            quickSort(arr,i,partition-1);
            quickSort(arr,partition+1,j);
        }
    }

    public static int partition(int[] arr,int low,int high){

        // 选取三个候选元素的中位数
        int med = medianThree(arr, low, (low + high) / 2, high);
        // 将中位数交换至数组最左端
        swap(arr, low, med);

        int i = low,j=high;
        while (i < j ){
            while (i < j && arr[j] > arr[low]){
                j --;
            }
            while (i < j && arr[i] < arr[high]){
                i ++;
            }
            swap(arr,i,j);
        }
        swap(arr,i,low);
        return i;
    }



    /*
    快速排序在某些输入下的时间效率可能降低。举一个极端例子，假设输入数组是完全倒序的，
    由于我们选择最左端元素作为基准数，那么在哨兵划分完成后，基准数被交换至数组最右端，导致左子数组长度为n-1 右子数组长度为0
    如此递归下去，每轮哨兵划分后都有一个子数组的长度为0
    分治策略失效，快速排序退化为“冒泡排序”的近似形式
     */

    /*
     * 可以在数组中选取三个候选元素（通常为数组的首、尾、中点元素），并将这三个候选元素的中位数作为基准数。这样一来，基准数“既不太小也不太大”的概率将大幅提升
     */

    static int medianThree(int[] nums, int left, int median, int right){
        if (nums[left] < nums[median] ^ nums[left] < nums[right]){
            return left;
        }
        else if (nums[median] < nums[left] ^ nums[median] < nums[right]){
            return median;
        }else {
            return right;
        }
    }

}

