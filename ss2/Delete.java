import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int indexDel;
        System.out.println("Mảng numbers gồm các phần tử: " + Arrays.toString(numbers));
        System.out.println("Hãy nhập một phần tử bạn muốn xóa khỏi mảng này");

        Scanner delNumber = new Scanner(System.in);

        System.out.println(" Phần tử muốn xóa là: ");
        int delNum = Integer.parseInt(delNumber.nextLine());

        indexDel = checkDelNum(delNum,numbers);

        if(indexDel != -1){
            System.out.println("Index phần tử cần xóa là: " + indexDel);
            for (int i = indexDel; i < numbers.length-1;i++){
                numbers[i]= numbers[i+1];

            }
            int numbersLength = numbers.length-1;
            numbers = Arrays.copyOf(numbers,numbersLength);

            System.out.println(" Mảng sau khi xóa: " + Arrays.toString(numbers));
        } else {
            System.out.println("Giá trị bạn muốn xóa không có trong mảng gốc !");
        }


    }


    public static int checkDelNum(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ( num == array[i]) {
                return i;

            }
        }
        return -1;
    }
}