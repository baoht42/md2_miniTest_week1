import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user;
        String password;
        Scanner sc = new Scanner(System.in);
        int countLogin = 0;
        while (countLogin < 3) {
            System.out.println("Enter id: ");
            user = sc.nextLine();
            System.out.println("Enter password: ");
            password = sc.nextLine();
            if (user.equals("admin") && password.equals("123456")) {
                displayMenu();
                break;
            } else {
                countLogin++;
                System.out.println("Wrong ID or Password, please try again! ");
            }
        }
        if (countLogin == 3) {
            System.out.println("Too many times login failed. Exit!");
            System.exit(0);
        }
    }

    private static void displayMenu() {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Draw Rectangle");
        System.out.println("2. Draw Square triangle");
        System.out.println("3. Draw Isosceles triangle");
        System.out.println("Your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter width of Rectangle: ");
                int widthRec = sc.nextInt();
                System.out.println("Enter lenght of Rectanble: ");
                int lenghtRec = sc.nextInt();
                for (int i = 0; i < widthRec; i++) {
                    for (int j = 0; j < lenghtRec; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Enter height of Square Triangle: ");
                int heightTri = sc.nextInt();
                System.out.println("Enter width of Square Triangle: ");
                int baseTri = sc.nextInt();
                if (heightTri>0 &&baseTri>0){
                    for (int i = 0; i < heightTri; i++) {
                        for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
                }else{
                    System.out.println("invalid side of Square Triangle!");
                }break;
            case 3:
//                System.out.println("Enter height of Isosceles triangle: ");
//                int heightIso = sc.nextInt();
//                System.out.println("Enter width of Isosceles triangle: ");
//                int widthIso = sc.nextInt();
//                if (heightIso>0 &&widthIso>0){
//                    for (int i = 0; i < heightIso; i++) {
//                        for (int j = 0; j < widthIso - i - 1; j++) {
//                            System.out.print(" ");
//                        }
//                        for (int k = 0; k <= 2 * i + 1 && k<widthIso ; k++) {
//                            System.out.print("*");
//                        }
//                        System.out.println();
//                    }
//                }else {
//                    System.out.println("invalid side of Isosceles triangle!");
//                }break;

            default:
                System.out.println("Nothing to show!");
        }
    }

}