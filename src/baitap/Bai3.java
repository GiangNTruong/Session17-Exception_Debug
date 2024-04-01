package baitap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
                arr[i] = scanner.nextInt();
                sum += arr[i];
            } catch (Exception e) {
                System.out.println("Giá trị nhập vào không phải là số nguyên và sẽ bị bỏ qua.");
                scanner.next(); // Loại bỏ giá trị không hợp lệ khỏi bộ đệm của scanner
            }
        }
        System.out.println("Tổng của các số nguyên trong mảng là: " + sum);
    }
}
