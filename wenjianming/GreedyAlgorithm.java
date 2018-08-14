package com.firename.week4;

import java.util.Scanner;

public class GreedyAlgorithm {

    public static void main(String[] args) {
        int[] num ={0,0,0,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        int c1,c2,c3,c4,c5,c6,c7;
        System.out.println("输入1元纸币的张数");
        c1 = scanner.nextInt();
        System.out.println("输入2元纸币的张数");
        c2 = scanner.nextInt();
        System.out.println("输入5元纸币的张数");
        c3 = scanner.nextInt();
        System.out.println("输入10元纸币的张数");
        c4 = scanner.nextInt();
        System.out.println("输入20元纸币的张数");
        c5 = scanner.nextInt();
        System.out.println("输入50元纸币的张数");
        c6 = scanner.nextInt();
        System.out.println("输入100元纸币的张数");
        c7 = scanner.nextInt();
        System.out.println("请输入需要支付的金额");
        int pay = scanner.nextInt();
        int[][] array={{1,c1},{2,c2},{5,c3},{10,c4},{20,c5},{50,c6},{100,c7}};
        int sum=0;
        for (int i=array.length-1;i>=0;i--){
            sum +=array[i][0]*array[i][1];
        }
        if (sum<pay) {
            System.out.println("支付金额太大，请重新输入");
            return;
        }
        for (int i=array.length-1;i>=0;i--){
            if (pay<array[i][0]*array[i][1]){
                num[i] = pay/array[i][0];
                pay -= num[i]*array[i][0];
            }else {
                num[i] = array[i][1];
                pay -= array[i][0]*num[i];
            }
            if (pay==0)
                break;
        }
        for (int i=0;i<num.length;i++){
            System.out.print(array[i][0]+":"+num[i]+"  ");
        }
    }
}
