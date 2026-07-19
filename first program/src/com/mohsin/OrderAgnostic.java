package com.mohsin;

public class OrderAgnostic {
    public static void main(String[] args){
//        int[] arr={-18,-12,-16,0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,20,22,24,27,28,30};

        int[] arr={90,89,70,50,40,22,20,17,16,15,12,10};
        int target=22;

        int ans=orderAgnosticSearch(arr,target);
        System.out.println(ans);

    }

    static int orderAgnosticSearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }


            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    end=mid+1;
                }
            }
        }

        return -1;
    }
}
