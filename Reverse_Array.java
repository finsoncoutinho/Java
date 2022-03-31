package com.fin;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

           int[] arr={1,2,3,4,5};
           reverse_arr(arr);

           System.out.print(Arrays.toString(arr));

        }

     static void reverse_arr(int[] arr) {
        int end=arr.length-1;
        int start=0;
        while(start<end){
         swap(arr,start,end);
           start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

}

