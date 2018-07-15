package sort;

import java.util.Random;
import java.util.Scanner;
//洗牌算法
public class FisherYates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请确认多少个数进行排序");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] =i+1;
        }
        //随机到最后一个数不用排序
        for ( int i=arr.length-1;i>0;i--){
            //产生随机数，使得数组上该索引为rand的位置放在i的位置上
            //即这两个索引上的值交换位置
            int rand=new Random().nextInt(i+1);
            int temp=arr[i];
            arr[i] =arr[rand];
            arr[rand]=temp;
        }
        for (int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
