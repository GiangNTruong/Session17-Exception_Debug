package baitap;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        while (true){
            try {
                System.out.println("Nhập chuỗi dảo ngược");
                str = scanner.nextLine();
                if (str == null || str.isEmpty()){
                    throw new IllegalArgumentException("chuỗi ko hop le , Nhap lai");

                }
                break;
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Chuỗi sau khi đảo " + reversedStr);
        scanner.close();
    }
}
