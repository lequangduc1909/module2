import java.util.Arrays;
import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = {1,3,5,7,9,2,4,6,8,10};
        System.out.println("Mảng ban đầu: "+"[" +Arrays.toString(numbers)+ "]");
        System.out.println("Hãy nhập giá trị muốn thêm vào mảng:");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Bạn muốn thêm giá trị "+x+ " vào vị trí nào ? Nhập vào:");
        int index = Integer.parseInt(sc.nextLine());

        if (index >= 0 || index < numbers.length){
            numbers = Arrays.copyOf(numbers, numbers.length+1);
            for ( int i = numbers.length-1; i > index ;i--){
                numbers[i]= numbers[i-1];
            }
            numbers[index] = x;
            System.out.println("Mảng sau khi thêm phần tử mới: " +Arrays.toString(numbers));
        } else{
            System.out.println("Index không hợp lệ");
        }
    }
}
