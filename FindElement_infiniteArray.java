package com.fin;

public class FindElement_infiniteArray {
    public static void main(String[] args) {
        int[] arr={1,4,7,14,19,26,29,30,32,37,40,55,69,76,79,83,89,99};
        int target=30;
        int ans=range(arr,target);
        System.out.println(ans);
    }

    public static int range(int[] arr,int target){
        int start =0, end=1;
        while (target>arr[end]){
            int temp= end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
     return binarySearch(arr,target,start,end);
    }

    public static int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid= start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
