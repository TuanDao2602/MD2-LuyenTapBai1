import java.util.Scanner;

public class bai3TinhToan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào số a");
        int a =scanner.nextInt();
        System.out.println("nhập vào số b");
        int b =scanner.nextInt();
        int tong=a+b;
        int hieu =a -b;
        int tich = a*b;
        int thuong = a/b;
        System.out.printf("tổng là : %d  hiệu là : %d  tích là  :%d  thương là  :%d",tong,hieu,tich,thuong);
    }
}
