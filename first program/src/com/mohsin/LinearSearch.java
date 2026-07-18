package com.mohsin;

public class LinearSearch {
    public static void main(String[] args){

        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,8,10,15},
        };

//        linearsearch(arr,15);
//
//        String name="Mohsin";
//        char c='n';
//
//
//        System.out.println(searchinstring(name,c));
//        System.out.println(search2(name,c));;

//        System.out.println(searchinrange(arr,9,2,10));

        search2d(arr,10);


    }


    static void linearsearch(int[] arr, int target){

        if(arr.length==0){
            System.out.println("Array is Empty");
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                System.out.println(arr[i] + " Found at the index " + i);
                break;
            }
        }
    }


    static boolean searchinstring(String sr,char target){
        if(sr.length()==0){
            return false;
        }

        for (int i=0;i<sr.length();i++){
            if(sr.charAt(i)==target){
                return true;
            }
        }

        return false;
    }


    static boolean search2(String sr,char target){
        if(sr.length()==0){
            return false;
        }

        for (char ch:sr.toCharArray()){
            if (ch==target){
                return true;
            }
        }

        return false;
    }


    static int searchinrange(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }

        for (int i=start;i<=end;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }

        return -1;
    }


    static int min(int[] arr){

        if(arr.length==0){
            return -1;
        }

        int min=arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    static void  search2d(int[][] arr,int target){
        if(arr.length==0){
            System.out.println("Array is Empty");;
        }


        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[i][j]==target){
                    System.out.println("Element found at the index Row: "+i+"Columns :"+j);
                }
            }
        }
    }
}
