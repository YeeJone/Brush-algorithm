package suanfa;

import java.util.Scanner;

/*
    折半查找又称二分查找(只适用于有序数组)，是线性表查找的一种
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("请输入需要查找的数");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int index = Serach_bin(arr, num);
        if (index>=0)
            System.out.println(num+" 这个数的索引为 "+index);
        else System.out.println("这个数不存在");

    }

    public  static int Serach_bin(int[] arr,int num){
        int low=0;
        int hight=arr.length-1;
        while (low<=hight){
            int mid=(low+hight)/2;
            if(arr[mid]>num) hight =mid-1;
            else if (arr[mid]<num) low=mid+1;
            else return mid;
        }
        return -1;
    }

}
