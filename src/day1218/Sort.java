package day1218;

import java.util.Scanner;

/*
* 输入十个整型数字排序后输出第五个元素
* **/
public class Sort {
    public static void main(String[] args) {
        System.out.println("输入数值：");
        int[] arr;
        arr = new int[10];
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            arr[i] = (int)scanner.nextInt();
        }
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1 - j; k++) {
                if (arr[k] > arr[k + 1]) {
                    int tmp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = tmp;
                }
            }
        }
        System.out.println("输出排序后的第五个元素：");
        for (int num = 0; num <= arr.length; num++) {
            System.out.println(arr[4]);
            break;
        }
    }
}
