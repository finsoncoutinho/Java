package com.fin;

public class ceilingNum {

    public static void main(String[] args) {
        int target = 15;
        int[] arr={1,5,9,14,17,20};

        int ans=ceiling(arr,target);
        System.out.println(ans);
    }

    // return the index of smalled num >= target
    public static int ceiling(int[] arr, int target){
        int start=0,end=arr.length;

        while(start<=end){
            // start+(end-start)/2; is better than start+end/2 when the array is too big
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

        return start;
    }


}
