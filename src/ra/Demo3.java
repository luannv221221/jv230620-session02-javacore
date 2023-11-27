package ra;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap vao 1 ky tu kiem tra xem no la nguyen am hay phu am
        String kyTu;
        System.out.println("Moi ban nhap vao ky tu bat ky");
        kyTu = sc.nextLine();

        switch (kyTu){
            case "u":
            case "e":
            case "o":
            case "a":
            case "i":
                System.out.println(kyTu+" la nguyen am");
                break;
            default:
                System.out.println(kyTu+"la phu am");
        }
    }
}
