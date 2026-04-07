import java.util.Scanner;

public class DrawShape {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:


                    System.out.println("\nBottom-left:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\nTop-left:");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\nBottom-right:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\nTop-right:");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    break;

                case 3:

                    int height = 5;

                    for (int i = 1; i <= height; i++) {


                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }


                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Exit chương trình.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}