package ra;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Nhập vào số từ 0 -5");
        num = Integer.parseInt(sc.nextLine());
        switch (num){
            case 0:
                System.out.println("So không");
                break;
            case 1:
                System.out.println("Số mot");
                break;
            case 2:
                System.out.println("so hai");
                break;
            case 3:
                System.out.println("so ba");
                break;
            case 4:
                System.out.println("so bon");
                break;
            case 5:
                System.out.println("so nam");
                break;
            default:
                System.out.println("so không hợp lệ");
        }
    }
}
