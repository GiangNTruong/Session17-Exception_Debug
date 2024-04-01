package baitap;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("NHập số lượng phần tử của mảng :");
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    throw new IllegalArgumentException("Số lượng phần tử của mảng phải là số dương");
                }
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn phải nhập số nguyên,nhap lai");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.println("Nhập giá trị phần tử thứ " + (i + 1) + " : ");
                    arr[i] = Integer.parseInt(scanner.nextLine());
                    sum += arr[i];
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Bạn phải nhập số nguyên, nhap lai.");
                }
            }
        }
        double average = (double) sum / n;
        System.out.println("Giá trị trung bình là: " + average);
        scanner.close();
    }
}
