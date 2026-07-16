package com.mohsin;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
public static void main(String[] args){

    Scanner input=new Scanner(System.in);

//    int[] arr=new int[5];
//
//    for (int i=0;i<arr.length;i++){
//        arr[i]=input.nextInt();
//    }

//    for(int i=0;i<arr.length;i++){
//        System.out.print(arr[i] +" ");
//    }

//    for (int num: arr){
//        System.out.print(num +" ");
//    }

//    System.out.print(Arrays.toString(arr));

//    ChangeType t=new ChangeType();
//
//    t.change(arr);

    int[][] arr2d=new int[3][3];

    for (int i=0;i<arr2d.length;i++){
        for (int j=0;j<arr2d[i].length;j++){
            arr2d[i][j]=input.nextInt();
        }
    }

    for (int[] a:arr2d){
        System.out.println(Arrays.toString(a)+ " ");
//        for (int b:a){
//
//        }
    }

}

}


//public class ChangeType{
//    void change(int[] arr){
//        arr[0]=99;
//    }
//}


