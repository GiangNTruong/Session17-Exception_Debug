package thuchanh;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Hãy nhập x: ");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("Hãy nhập y: ");
            int y = Integer.parseInt(scanner.nextLine());

            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (NumberFormatException e) {
            System.err.println("Lỗi: Bạn phải nhập một số nguyên. Hãy thử lại.");
        } catch (ArithmeticException e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
        scanner.close();
    }
}
