package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str = scanner.nextLine();
        List<Integer> list = new ArrayList<>();

        for (char c : str.toCharArray()) {
            try {
                list.add(Integer.parseInt(String.valueOf(c)));
            } catch (NumberFormatException e) {
                System.out.println("Ký tự '" + c + "' không phải là số nguyên và đã được thay thế bằng 0.");
                list.add(0);
            }
        }

        System.out.println("Mảng số nguyên sau khi chuyển đổi là: " + list);
    }
}
