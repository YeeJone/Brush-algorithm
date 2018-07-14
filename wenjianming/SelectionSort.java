package com.firename.week2;

public class SelectionSort {

    private static void sort(int[] a,int start){

        int length=a.length;
        for (int i=start+1;i<length;i++){
            if (a[start]>a[i]){
                int temp=a[i];
                a[i] = a[start];
                a[start] = temp;
            }
        }
        if (start+1==length) return;
        sort(a,start+1);
    }

    public static void main(String[] args) {
        int[] a={3,1,7,6,8,9,4,5,6,3,6};
        sort(a,0);
        int length = a.length;
        for(int i=0;i<length;i++){
            System.out.print(" "+a[i]);
        }
    }
}
