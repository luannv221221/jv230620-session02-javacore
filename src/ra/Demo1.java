package ra;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // khai báo biến kiểu dữ liệu hay dùng , nhập xuất
        Scanner sc = new Scanner(System.in);

        int soNguyen;
        System.out.println("Moi ban nhap vào số nguyên");
        soNguyen = Integer.parseInt(sc.nextLine());
        System.out.println("Giá trị của số nguyên vừa nhâp là "+soNguyen);
        // số thực float
        float soThuc;
        System.out.println("Mời bạn nhập vào số thực");
        soThuc = Float.parseFloat(sc.nextLine());
        System.out.println("Số thực vừa nhập là "+soThuc);
        // ký tự
        String fullName;
        System.out.println("Mời bạn nhập vào họ tên");
        fullName = sc.nextLine();
        System.out.println("Họ và tên là : "+fullName);
    }
}
