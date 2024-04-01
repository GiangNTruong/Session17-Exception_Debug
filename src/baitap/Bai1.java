package baitap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        while (true) {
            try {
                System.out.println("Nhập số thứ nhất:");
                num1 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Giá trị nhập vào không phải là số nguyên. Vui lòng nhập lại.");
            }
        }

        while (true) {
            try {
                System.out.println("Nhập số thứ hai:");
                num2 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Giá trị nhập vào không phải là số nguyên. Vui lòng nhập lại.");
            }
        }

        int sum = num1 + num2;
        System.out.println("Tổng của hai số là: " + sum);
    }
}
