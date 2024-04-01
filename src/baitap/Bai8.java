package baitap;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int snt=0;
        while (true){
            try {
                System.out.println("Nhập số cần kiểm tra");
                snt = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Ko hợp lệ");
            }
        }
        if (isPrime(snt)){
            System.out.println(snt + " là nguyen to");
        }else {
            System.out.println(snt + " ko la nguyen to");
        }

    }
    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if (num%i==0){
                return false;
            }
        }return true;
    }
}
