package unit1;


import java.util.Scanner;

public class KtSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        System.out.println(number);

        if (number < 2){
            System.out.println(number + " is not a prime");
        }else {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }

    }
}
