package Bai1;

import java.util.Arrays;

public class SapXepChenDemo {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Bước " + i + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};

        System.out.println("Ban đầu: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Kết quả: " + Arrays.toString(arr));
    }
}