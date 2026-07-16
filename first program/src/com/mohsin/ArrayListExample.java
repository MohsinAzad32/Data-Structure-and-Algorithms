package com.mohsin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
//        ArrayList<Integer> list=new ArrayList<>();
//
//
//        list.add(1);
//        list.add(2);
//        list.add(5);
//        list.add(10);
//        list.add(20);
//
//        System.out.println(list);
//
//
//        list.set(0,90);
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);


//        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
//
//        for (int i=0;i<3;i++){
//            list.add(new ArrayList<>());
//        }
//
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                list.get(i).add(in.nextInt());
//            }
//        }
//
//        System.out.println(list);



int[] arr={1,2,3,4,5,6,7,8,9,10,50,100,1000};
reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2){

        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static int findmax(int[] arr){

        int max=arr[0];

        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }


    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
