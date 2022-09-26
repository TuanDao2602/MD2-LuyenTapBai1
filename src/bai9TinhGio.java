import java.util.Scanner;

public class bai9TinhGio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số giây");
        int giay = scanner.nextInt();
        int gio= giay/3600;
        int phut = (giay%3600)/60;
        System.out.printf(" số giờ là : %d\n số phút là : %d\n số giây là : %d",gio,phut,giay);
    }
}
