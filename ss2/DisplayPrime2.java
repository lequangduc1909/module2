import java.util.Scanner;

public class DisplayPrime {

    public static void main(String[] args) {

        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");

        for (int i = 2; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
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