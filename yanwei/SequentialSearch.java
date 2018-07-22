package suanfa;

import java.util.Scanner;

/*
    线性查找又称顺序查找，是线性表查询的一种
 */
public class SequentialSearch {
    public static void main(String[] args) {
        System.out.println("请输入需要查找的数");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr={2,3,1,4,6,5,7,9,0,8};
        int index = Search_seq(arr, num);
        if (index>=0)
            System.out.println(num+" 这个数的索引为 "+index);
        else System.out.println("这个数不存在");
}

    public static int Search_seq(int[] arr,int num) {
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}
