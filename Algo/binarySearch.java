package com.fin;

public class binarySearch {

    public static void main(String[] args) {
        int target = 17;
        int[] arr={1,5,9,14,17,20};

        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr, int target){
        int start=0,end=arr.length;

        while(start<=end){
            int mid = start+((end-start)/2);

            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


}
