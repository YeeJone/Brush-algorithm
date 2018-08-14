package com.firename.week4;

public class FullPermutation_4 {
    static int count=0;

    static void perm(int[] array,int p){
        if (p<array.length-1) {
            perm(array, p + 1);
            for (int i = p + 1; i < array.length; i++) {
                swap(array, p, i);
                listArray(array);
                System.out.println();
                count++;
                perm(array, p + 1);
                swap(array, p, i);
            }
        }
    }

    static void listArray(int[] array){
        for (int c :
                array) {
            System.out.print(c);
        }
    }

    static void swap(int[] array,int x,int y){
        int temp=array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        listArray(a);
        System.out.println();
        count++;
        perm(a,0);
        System.out.println(count);
    }
}
