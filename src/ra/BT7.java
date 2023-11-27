package ra;

import java.util.Scanner;

public class BT7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("==========MENU============");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật .");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn.");
            System.out.println("4. Thoát");
            System.out.println("Mời bạn nhập chon(1-4)");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    HCN();
                    break;
                case 2:
                    System.out.println("Tính chu vi và diện tích hình tam giác");
                    float a,b,c;
                    System.out.println("Nhap vao ba canh tam giac ");
                    System.out.println("Canh a = ");
                    a = Float.parseFloat(scanner.nextLine());
                    System.out.println("Canh b = ");
                    b = Float.parseFloat(scanner.nextLine());
                    System.out.println("Canh c = ");
                    c = Float.parseFloat(scanner.nextLine());
                    // kiem tra xem no co phai la tam giac khong
                    // neu la tam giac
                        // tich dien tich
                        // tinh chu vi
                        // in ra ket qua man hinh
                    // neu khong phai tam giac in ra thong bao
                    break;
                case 3:
                    System.out.println("3. Tính chu vi và diện tích hình tròn.");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chọn không hợp lệ");
            }
        } while (true);
    }

    public static void HCN(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính chu vi và diện tích hình chữ nhật");
        float chieuDai,chieuRong;
        System.out.println("Nhap vao chieu dai hinh chu nhat");
        chieuDai = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap vao chieu rong hinh chu nhat");
        chieuRong = Float.parseFloat(scanner.nextLine());
        // tinh toan
        float chuVi = (chieuDai + chieuRong) * 2;
        float dienTinh = (chieuDai * chieuRong);
        System.out.println("Dien tich hinh chu nhat la : "+dienTinh);
        System.out.println("Chu vi hinh chu nhat la : "+chuVi);
    }
}
