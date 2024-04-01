package baitap;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhạp số bị chia");
        int x1=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số chia");
        int x2 = Integer.parseInt(scanner.nextLine());
        try {
            int result =x1/x2;
            System.out.println("kết quả phép chia là : "+result);
        }catch (ArithmeticException e){
            System.err.println("Không thể chia cho 0");
        }finally {
            scanner.close();
        }
    }
}
