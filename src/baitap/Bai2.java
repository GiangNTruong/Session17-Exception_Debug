package baitap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phan tu cua mang");
        int n = sc.nextInt();
        int [] array = new int[n];
        if (n ==0){
            throw  new Exception("Mảng ko co phan tu");
        }
        System.out.println("Nhạp cac phan tu của mang");
        for (int i = 0; i < n; i++) {
            array[i] =sc.nextInt();
        }
        int max =array[0];
        for (int i = 0; i < n; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Số max là : "+ max);
    }
}
