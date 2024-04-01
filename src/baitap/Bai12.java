package baitap;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int number1=0,number2=0;
        boolean validInput=false;
        while (!validInput){
            try {
                System.out.println("Nhập số 1 :");
                number1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số 2 : ");
                number2 = Integer.parseInt(scanner.nextLine());
                if (number1==0 && number2==0){
                    throw new IllegalArgumentException("Cả 2 ssó ko thể đôn thời = 0");
                }
                validInput=true;
            }catch (NumberFormatException e){
                System.err.println("Nhap so nguyen ma , Nhap lai");
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        int gcd = findGCD(number1,number2);
        System.out.println("Ước chung lon nhat của " + number1 + "vs" +number2 +"là"+gcd);
        scanner.close();

    }
    private static int findGCD (int num1,int num2){
        if(num2==0){
            return num1;
        }return findGCD(num2,num1%num2);
    }
}
