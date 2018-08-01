package com.firename.week4;

public class ChildArraySum {

    static int perm(int[] array,int sum,int max) {
        for (int i=0;i<array.length;i++) {
            sum += array[i];
            sum = sum < 0 ? 0 : sum;
            max = sum>max?sum:max;
            }
       return max;
    }

    public static void main(String[] args) {
        int[] a={1,3,-5,6,3,-6,7,4};
        int max = perm(a, 0, 0);
        System.out.println(max);
    }
}
