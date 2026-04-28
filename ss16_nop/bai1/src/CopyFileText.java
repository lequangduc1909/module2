import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập file nguồn: ");
        String source = scanner.nextLine();

        System.out.print("Nhập file đích: ");
        String target = scanner.nextLine();

        File sourceFile = new File(source);
        File targetFile = new File(target);

        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại!");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại!");
            return;
        }

        int charCount = 0;

        try (
                FileReader fr = new FileReader(sourceFile);
                BufferedReader br = new BufferedReader(fr);

                FileWriter fw = new FileWriter(targetFile);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            int ch;

            while ((ch = br.read()) != -1) {
                bw.write(ch);
                charCount++;
            }

            System.out.println("Copy thành công!");
            System.out.println("Số ký tự: " + charCount);

        } catch (IOException e) {
            System.out.println("Lỗi khi xử lý file!");
            e.printStackTrace();
        }
    }
}