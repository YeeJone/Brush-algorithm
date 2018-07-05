package sort;

import java.util.Arrays;

//归并排序
public class MergeSort {

    public static void main(String[] args) {
        int[] arr={2,3,5,1,6,8,7,0,9,4};
        group(arr);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }

    //排序、合并
    public static void sort(int[] arr,int[] a,int[] b){
        int i=0,l=0,r=0;
        while (l < a.length && r < b.length){
            //分组到最后，是一个数为一个数组，就相当于两个数作比较，谁小将值放入arr数组中
            if (a[l]<b[r]){
                arr[i]=a[l];
                i++;
                l++;
            }else {
                arr[i] = b[r];
                i++;
                r++;
            }
        }
        //当左边部分的值没有排序完，将值放入arr数组中
        while (l<a.length){
            arr[i] =a[l];
            i++;
            l++;
        }
        //当右边部分的值没有排序完，将值放入arr数组中
        while (r<b.length){
            arr[i] =b[r];
            i++;
            r++;
        }
    }

    //分组
    public static void group(int[] arr){
        int middle= arr.length/2;
        if (arr.length>1){
            int[] a= Arrays.copyOfRange(arr,0,middle);//左边数组
            int[] b= Arrays.copyOfRange(arr,middle,arr.length);//右边数组
            group(a);
            group(b);
            sort(arr,a,b);
        }
        }

}
