import java.util.InputMismatchException;
import java.util.Scanner;
/*
* try{
* code có thể ném Exception
* }catch(Exception e){
* code muốn chạy sau khi chạy được Exception
* }
* */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn bao nhiêu tuổi");

        System.out.println("Ket thuc chuong trinh");
        try {
            int age = sc.nextInt();
            System.out.println("Tuổi của bạn là " +age);
            int error = age/0;
        }catch (InputMismatchException e){
            System.out.println("Vui long nhap so");
        }catch (ArithmeticException ae){
            System.out.println("ko the chua cho 0");
        }finally {
            System.out.println("Ban dang o trong finaalyy block");
        }
        System.out.println("ket thúc chương trình");
    }

}

//Exception là 1 sự kiện khng mong muốn m khi xảy ra nó sẽ làm gián đoạn chương trình đang chạy

