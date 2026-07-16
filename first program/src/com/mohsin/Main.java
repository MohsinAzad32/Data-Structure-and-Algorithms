package com.mohsin;

import java.util.Scanner;

public class Main{
    public static  void main(String[] args){
        Scanner input=new Scanner(System.in);

//        String name=input.next();
//        System.out.print(name);

//        int num=(int)(67.23);
//        System.out.print(num);


//        int count=1;
//
//        while(count!=5){
//            System.out.println(count);
//            count++;
//        }
        System.out.println("Enter Temprature in Celcius");
        int temp=input.nextInt();
        float fh= (float)(temp*1.8 +32);
        System.out.println("Temprature in Farenheight"+fh);
    }
}