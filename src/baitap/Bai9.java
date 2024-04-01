package baitap;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Nhập số thứ tự trong dãy Fibonacci: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    throw new IllegalArgumentException("Số thứ tự phải là số nguyên dương.");
                }
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn phải nhập một số nguyên. Hãy thử lại.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        int fib = fibonacci1(n);
        System.out.println("Số Fibonacci thứ " + n + " là: " + fib);

        scanner.close();
    }
    public static int fibonacci1(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    // dùng de quy
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
