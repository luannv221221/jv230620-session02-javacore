package ra;

import java.util.Scanner;

public class Demo07 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ban muon xem bang cuu chuong may");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }

    }
}
