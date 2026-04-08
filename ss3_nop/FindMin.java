import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử có trong mảng:");
        int a = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[a];

        System.out.println("Mời nhập " + a + " phần tử có trong mảng: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ": ");
            int value = Integer.parseInt(sc.nextLine());
            numbers[i] = value;
        }

        System.out.println("Mảng bạn đã nhập: "+ Arrays.toString(numbers));

        System.out.println("Giá trị nhỏ nhất trong mảng của bạn đã nhập: " + findMin(numbers));

    }
    public static int findMin(int[]array){
        int min = array[0];
        for (int i = 1; i<array.length;i++){
            if (array[i]< min){
                min = array[i];
            }
        }
        return min;
    }
}
