package com.mohsin;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

import java.util.Arrays;

public class EvenDigit {
    public static void main(String[] args){
int[] arr={18,129,8,1789};
        System.out.println(findEvenDigitNums(arr));
    }


    static int findEvenDigitNums(int [] numarr){
        int count=0;

//        String arr= Arrays.toString(numarr);
//        System.out.println(Arrays.toString(numarr));
        for (int i=0;i<numarr.length;i++){
            int digits=(int) Math.log10(numarr[i])+1;

            if(digits%2==0){
                count++;
            }
        }

        return count;
    }
}



