import java.util.Scanner;

public class bai8DaoNguoc {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào 1 số nguyên gồm 3 chữ số");
        int num = scanner.nextInt();
        int a =num/100;
        int b =(num%100)/10;
        int c =(num%10);
        System.out.println(" số đảo ngược là "+c+b+a);
    }
}
