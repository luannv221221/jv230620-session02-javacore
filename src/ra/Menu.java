package ra;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("==========MENU============");
            System.out.println("1. Món Gà");
            System.out.println("2. Món Bò");
            System.out.println("3. Chó");
            System.out.println("4. Thoát");
            System.out.println("Mời bạn nhập chon(1-4)");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Mời bạn món ga");
                    break;
                case 2:
                    System.out.println("Mời bạn món bò");
                    break;
                case 3:
                    System.out.println("Mời bạn món Chó");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chọn không hợp lệ");
            }
        } while (true);

    }
}
