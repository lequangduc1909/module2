import java.util.Scanner;

public class DisplayPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int numbers = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int N = 2;

        while (count < numbers) {
            if (checkPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    public static boolean checkPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}