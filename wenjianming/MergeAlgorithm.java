package com.firename.week1;

public class MergeAlgorithm {
    /*
    start 为该段数组的开始下标，
    len为 该段数组的长度
     */
    public static void merge(int[] a,int start,int len){
        int length = a.length;
        int num = length/(len<<1);
        int c=length&(len*2-1);
        for (int i = 0; i < num; i++) {
            int s = start + len * 2 * i;
            sort(a, s, s + len, s + len * 2 - 1);
        }
        if(c!=0）{
	    sort(a, length - c - 2 * len, length - c, length - 1);
	}
	merge(a ,0 ,len*2);
    }
    public static void sort(int[] a,int start,int mid,int end){
        int[] temp = new int[end-start+1];
        int s=start,m=mid,i=0;
        while (s<mid&&m<=end){
            if (a[s]<a[m]){
                temp[i]=a[s];
                i++;
                s++;
            }else {
                temp[i] = a[m];
                i++;
                m++;
            }
            while (s<mid){
                temp[i] = a[s];
                i++;
                s++;
            }
            while (m<=end){
                temp[i] = a[m];
                i++;
                m++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{5,3,6,8,1,3,5,7,9};
        merge(a, 0, 1);
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + "　");
        }
    }
}
