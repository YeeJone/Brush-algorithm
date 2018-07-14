package com.firename.week2;

import java.util.Random;

public class ShuffleSort {

    static void shuffle(int[] a,int i){
        if (i==0) return;
        int len=a.length;
        int num=(int)(i*Math.random());
        int temp = a[num];
        a[num] = a[i-1];
        a[i-1]=temp;
        i--;
        shuffle(a,i);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,0};
        int i = a.length;
        shuffle(a,i);
        for (int n :
                a) {
            System.out.print(n);
        }
    }
}
