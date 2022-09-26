import java.util.Scanner;

public class bai5TamGiac {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào canh a");
        double a =scanner.nextDouble();
        System.out.println(" nhập vào cạnh b");
        double b =scanner.nextDouble();
        System.out.println("nhập vào cạnh c");
        double c=scanner.nextDouble();
        if (a+b>c && a+c >b && b+c >a){
            System.out.println("đây là 1 tam giác");
            if (a==b && a==c && b==c){
                System.out.println("đây là tam giác đều");
            }else if (a==b&& b !=c && 2*a*a == c*c
                    || b==b && c !=a && 2*b*b==a*a
                    || c==a && a!=b &&2*c*c==b*b){
                System.out.println("đây là tam giác vuông cân");
            }else if (a==b ||a==c || b==c){
                System.out.println("đây là tam giác cân");
            }else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("đây là tam giác vuông");
            }
        }else {
            System.out.println("đây ko phải là tam giác");
        }
    }
}
