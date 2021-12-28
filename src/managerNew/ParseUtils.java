package managerNew;

import java.util.Scanner;

public class ParseUtils {
    static Scanner scanner = new Scanner(System.in);

    public static int tryParseInt() {
        try {
            System.out.println("enter id: ");
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Nhap sai vui long nhap lai");
        }
        return -1;
    }

    public static int retryParseInt(String message) {
        int number = -1;
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println(message);
            }
        } while (number == -1);
        return number;
//        if (number == -1)
//            throw new ValidateException("");
        //return number;
    }
}
