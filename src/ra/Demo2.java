package ra;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // kiểm tra so nguyen nhap vao la so chan hay le
        int a;
        System.out.println("Mời bạn nhập vào số nguyên bất kỳ ");
        a = Integer.parseInt(sc.nextLine());
        // kiểm tra số chẵn lẻ
        if(a % 2 == 0){
            System.out.println(a+" là số chẵn");
        } else {
            System.out.println(a+" là số le");
        }
    }
}
