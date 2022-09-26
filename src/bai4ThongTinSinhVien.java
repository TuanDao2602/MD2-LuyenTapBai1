import java.util.Scanner;

public class bai4ThongTinSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào mã sinh viên");
        String studentId = scanner.nextLine();
        System.out.println("nhập vào tên sinh viên : ");
        String studentName = scanner.nextLine();
        System.out.println("nhập vào tuổi sinh viên");
        int age =scanner.nextInt();
        System.out.println("nhập vào giới tính sinh viên");
        boolean sex = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("nhập vào email của sinh viên");

        String email = scanner.nextLine();
        System.out.println("nhập vào số điện thoại của sv");
        int soDienThoai = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập vào địa chỉ sinh viên");
        String address =scanner.nextLine();

//        System.out.printf("%15s %10s %15s %30s %6s %20d  mã sv: %s tên: %s tuổi %d giới tính : %b email: %s sđt %d");
        System.out.printf("%15s %10s %15s %30s %6s %20d %15s", studentId,studentName,age,sex,email,soDienThoai,address );

    }
}

