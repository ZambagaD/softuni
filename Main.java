import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // test another test
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int number2 = 2;
        int number3 = 3;
        int number6 = 6;
        int number7 = 7;
        int number10 = 11;

        if (number % number10 == 0) {
            System.out.printf("The number is divisible by %d", number10);
        }
        else if (number % number7 == 0) {
            System.out.printf("The number is divisible by %d", number7);
        }
        else if (number % number2 == 0 && number % number3 == 0) {
            System.out.printf("The number is divisible by %d", number6);
        }
        else if (number % number3 == 0) {
            System.out.printf("The number is divisible by %d", number3);
        }
       else if (number % number2 == 0) {
            System.out.printf("The number is divisible by %d", number2);
        } else
            System.out.println("Not divisible");
    }
}
