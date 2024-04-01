package baitap;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Nhập bán kính hình tròn: ");
                radius = Double.parseDouble(scanner.nextLine());
                if (radius < 0) {
                    throw new IllegalArgumentException("Bán kính phải là số không âm.");
                }
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn phải nhập một số. Hãy thử lại.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Diện tích hình tròn là: " + area);

        scanner.close();
    }
}
