package com.firename.week1;

public class FastSort {
    public static void sort(int[] array,int start,int end){
        if (start>=end){
            return;
        }
        int i=start;
        int temp = array[start];
        int j=end;
        while (i<j){
            while (i<j&&array[j]>temp)
                j--;
            if (i<j&&array[j]<temp){
                array[i] = array[j];
                i++;
                while (i<j&&array[i]<temp)
                    i++;
                if (i<j&&array[i]>temp){
                    array[j] = array[i];
                    j--;
                }
                array[i]=temp;
            }
            for (int num :
                    array) {
                System.out.print(num);
            }
            System.out.println();
        }
        sort(array,start,i);
        sort(array,j+1,end);
    }

    public static void main(String[] args) {
        int a[]={5,6,2,7,8,9,4};
        int len = a.length;
        sort(a,0,len-1);
        for (int num :
                a) {
            System.out.print(num);
        }
    }
}
