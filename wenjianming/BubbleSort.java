package com.firename.week2;

public class BubbleSort {
    private static void sort(int[] array,int end){
        if (end==0) return;
        for (int i=0;i<end-1;i++){
            if (array[i]>array[i+1]){
                int temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
        sort(array,end-1);
    }

    public static void main(String[] args) {
        int[] a={1,5,3,8,6,9,4,6,7};
        int length = a.length;
        sort(a,length);
        for(int i=0;i<length;i++){
            System.out.print(" "+a[i]);
        }
    }
}
