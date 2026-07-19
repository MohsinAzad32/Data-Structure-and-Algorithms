package com.mohsin;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr={-18,-12,-16,0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,20,22,24,27,28,30};

        int target=22;
        int ans=binarySearch(arr,target);
        System.out.println(ans);

    }


    static int binarySearch(int[] arr,int target){
        if(arr==null|| arr.length==0){
            return -1;
        }

        int start=0;
        int end=arr.length-1;


        while(start<=end){
            int mid= start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
