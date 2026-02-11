import java.util.Scanner;

public class StudentUtilityApp {
    public static void main(String[] args) {

        int choice;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println(">>>>STUDENT UTILITY APP<<<<");
            System.out.println("1. Add two number");
            System.out.println("2. Check if a number is EVEN or ODD");
            System.out.println("3. Print numbers from 1 to N");
            System.out.println("4. Display day of the week");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1){
                System.out.println("Addition: Enter two numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a + b);
            } else if (choice == 2) {
                System.out.println("Enter a digit to check if it is EVEN or ODD");
                int number = scanner.nextInt();
                checkEvenOrdOdd(number);
            } else if (choice == 3) {
                System.out.println("Enter a value for N");
                int N = scanner.nextInt();
                print1toN(N);
            } else if (choice == 4) {
                System.out.println("Enter a number from (1 - 7)");
                int day = scanner.nextInt();
                checkDay(day);
            } else if (choice == 5) {
                System.out.println("Thank you for using the app");
                scanner.close();
            }else {
                System.out.println("Select an option");
            }
        }while (choice != 5);
        scanner.close();
    }

    public static void checkEvenOrdOdd(int number){
        String result = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(result);
    }

    public static void print1toN(int N){
        for (int i = 1; i<=N; i++){
            System.out.print(i + " ");
        }
    }

    public static void checkDay(int day){
        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Invalid day");

        }
    }
}