package baitap;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1=0; int x2 =0;
        boolean validInput = false;
        while (!validInput){
            try {
                System.out.println("Nhập số x1 : ");
                x1= Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số x2 : ");
                x2= Integer.parseInt(scanner.nextLine());
                validInput = true;
            }catch (NumberFormatException e){
                System.err.println("KHông hợp le , nhap lai");
            }
        }
        int max = Math.max(x1, x2);
        System.out.println("Max là " + max);
    }
}
