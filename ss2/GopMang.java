import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập số lượng phần tử mong muốn có trong mảng thứ nhất: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Mời bạn nhập số lượng phần tử mong muốn có trong mảng thứ hai:");
        int b = Integer.parseInt(sc.nextLine());

        int[] arrayA = new int[a];
        int[] arrayB = new int[b];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + " của mảng thứ nhất là:");
            arrayA[i] = Integer.parseInt(sc.nextLine());
        }

        for (int j = 0; j < arrayB.length; j++) {
            System.out.println("Phần tử thứ " + (j + 1) + " của mảng thứ hai là:");
            arrayB[j] = Integer.parseInt(sc.nextLine());
        }

        int[] arrayC = new int[a + b];

        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i];
        }

        for (int i = 0; i < arrayB.length; i++) {
            arrayC[a + i] = arrayB[i];
        }

        System.out.println("Mảng sau khi gộp là:");
        for (int i = 0; i < arrayC.length; i++) {
            System.out.print(arrayC[i] + " ");
        }

        sc.close();
    }
}