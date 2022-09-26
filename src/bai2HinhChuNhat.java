import java.util.Scanner;

public class bai2HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào cạnh a");
        double a=scanner.nextDouble();
        System.out.println("nhập vào cạnh b");
        double b =scanner.nextDouble();
        if ( a >0&&b>0){
            double dienTich = a*b;
            double chuVi = (a+b)*2;
            System.out.printf("chu vi là %f diện tích là : %f",chuVi,dienTich);
        }else {
            System.out.println("mời nhập lại a và b");
        }
    }
}
