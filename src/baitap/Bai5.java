
package baitap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập so luong phan tu ");
        int n = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[n];
        System.out.println("Nhâp cac phan tu cua mang ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Giá trị can tim");
        int x = Integer.parseInt(scanner.nextLine());
        try {
            int search = binarySearch(arr,x);
            System.out.println("Vị trí tìm thấy là " + search);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private static int binarySearch(int [] arr , int x) throws Exception {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==x){
                return mid;
            } else if (arr[mid]<x) {
                start = mid+1;
            }else end = mid-1;
        }
        throw new Exception("Phần tử không tồn tại trong mảng");
    }
}
