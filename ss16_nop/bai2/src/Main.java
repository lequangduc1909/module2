import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Country> list = readCSV("data/countries.txt");

        for (Country c : list) {
            System.out.println(c);
        }
    }

    public static List<Country> readCSV(String path) {
        List<Country> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);

                String code = parts[1].replace("\"", "");
                String name = parts[2].replace("\"", "");

                list.add(new Country(id, code, name));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}