import java.util.Scanner;

public class bai6NgayThang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int year;

        System.out.println("enter a year: ");

        year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0){
            if (year %100==0){
                if (year % 400 ==0){
                    isLeapYear=true;
                }
            }else {
                isLeapYear=true;
            }
        }
        if (isLeapYear){
            System.out.println(" is a leap year");
        }else {
            System.out.println(" is Not a leap year" );
        }

         System.out.println("Nhập vào 1 tháng?");// nhập tháng muốn đếm ngày
        int month = scanner.nextInt();
        switch (month){
            case 2: if (isLeapYear){
                System.out.println("the month"+month+" 29 days");
                break;
            }else {
                System.out.println("Tháng 2 có 28 ngày");
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month "+month+"has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month "+month+"has 30 days!");
                break;
            default:
                System.out.println("mời bạn nhập lại tháng ");
        }

    }
}
