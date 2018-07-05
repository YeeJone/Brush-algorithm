package sort;

import java.util.Scanner;

//快速排序（交换排序）
//1、选择第一个或最后一个元素作为中轴值
// （这里获得的中轴值所在的索引也是数组最终排序该值所在的索引位置）
//2、通过第一趟排序将数组分为两组，一组大于中轴值，一组小于中轴值
//3、同上分别对新的两组数组，用同样的方法对两组数组进行排序
public class QuickSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请确认多少个数进行排序");
        int n=sc.nextInt();
        System.out.println("请输入"+n+"个整数");
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
//        int[] arr={2,3,5,1,6,8,7,0,9,4};
        sort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //获取中轴
    public static int getMiddle(int arr[],int low, int top){
        int temp=arr[low];//数组第一个元素为中轴值
        while (low < top){
            while (low < top && temp<= arr[top]){//比中轴大，不需要移动位置（这里top本就在中轴右边）
                top --;
            }
            arr[low] =arr[top];//比中轴小的放在中轴左边
            while (low < top && temp>= arr[low]){
                low ++;
            }
            arr[top] =arr[low];//比中轴大的放入中轴右端
        }
        arr[low] =temp;
        return low;
    }

//    通过求中轴，将数组分成两组，大于中轴的一组，小于中轴的为一组
//    再利用递归将小数组进行排序
    public static void sort(int arr[],int low, int top){
        if (low <top){
            int middle=getMiddle(arr,low,top);
            sort(arr,low,middle-1);
            sort(arr,middle+1,top);
        }
    }
}