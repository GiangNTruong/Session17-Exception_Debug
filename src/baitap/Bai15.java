package baitap;

import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String s) {
        super(s);
    }
}

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh thứ nhất ");
            int side1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh thứ hai ");
            int side2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh thứ ba ");
            int side3 = Integer.parseInt(scanner.nextLine());

            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                throw new IllegalTriangleException("Các cạnh của tam giác phải là số dương.");
            }
            if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                throw new IllegalTriangleException("Tổng hai cạnh của tam giác phải lớn hơn cạnh còn lại.");
            }
            System.out.println("Đây là một tam giác hợp lệ.");
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Bạn phải nhập một số nguyên. Hãy thử lại.");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
