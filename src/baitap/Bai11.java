package baitap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int day = 0 , month = 0, year =0;
       boolean validInput = false;
       while (!validInput){
           try {
               System.out.println("Nhập ngày: ");
               day = Integer.parseInt(scanner.nextLine());
               System.out.println("Nhập tháng: ");
               month = Integer.parseInt(scanner.nextLine());
               System.out.println("Nhập năm: ");
               year = Integer.parseInt(scanner.nextLine());
               if (year<=0 ||month<=0||month>12||day<=0||day>31){
                   throw new IllegalArgumentException("Ngày tháng năm ko hợp lệ ");
               }
               validInput=true;
           }catch (NumberFormatException e){
               System.out.println("Nhập 1 so mà , nhap lai");
           }catch (IllegalArgumentException e){
               System.out.println(e.getMessage());
           }
        }
        System.out.println("Hợp lệ");
       scanner.close();
    }
}
