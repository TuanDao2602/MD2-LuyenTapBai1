import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int bac1=700;
        int bac2=900;
        int bac3=1100;
        int bac4=1300;
        int thueBao=10000;
        System.out.println("nhập vào số điện tiêu thụ cũ ");
        int soDienCu = scanner.nextInt();
        System.out.println("nhập vào số điện tiêu thụ mới");
        int soDienMoi =scanner.nextInt();
        int soDienTieuDung = soDienMoi-soDienCu;
        int tienDien;
        if (soDienTieuDung>0&& soDienTieuDung <50){
            tienDien= (thueBao+ soDienTieuDung*700 );
            System.out.printf("số điện là : %d, số tiền điện là : %d ",soDienTieuDung,tienDien);
        }else if (soDienTieuDung>=50 && soDienTieuDung <=100){
            tienDien = (thueBao+50*bac1 + ((soDienTieuDung -50)*bac2));
            System.out.printf("số điện là : %d, số tiền điện là : %d ",soDienTieuDung,tienDien);
        }else if (soDienTieuDung>=100 && soDienTieuDung<=150){
            tienDien = (thueBao + (50*bac1) + (50*bac2)+ (soDienTieuDung-100)*bac3);
            System.out.printf("số điện là : %d, số tiền điện là : %d ",soDienTieuDung,tienDien);
        }else {
            tienDien=(thueBao+(50*bac1)+ (50*bac2)+ (50*bac3)+ (soDienTieuDung-150)*bac4);
            System.out.printf("số điện là : %d, số tiền điện là : %d ",soDienTieuDung,tienDien);
        }
    }

}
