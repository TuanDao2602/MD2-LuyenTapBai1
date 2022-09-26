import java.util.Scanner;

public class bai1HinhVuong {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" nhập vào 1 cạnh của hình vuông");

            double canhA = scanner.nextDouble();
        if (canhA>0) {
            double dienTich = canhA * canhA;
            double chuVi = 4 * canhA;
            System.out.printf("chu vi là: %f diện tích là : %f",chuVi,dienTich);
        }else {
            System.out.println("mời nhập lại");
        }
    }
}
