package homework8.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    private static File file = new File("input_data.txt");
    private static FileInputStream inputStream = null;
    private static ArrayList<Character> arrayList = new ArrayList();

    public static void main(String[] args) {
        try {
            inputStream = new FileInputStream(file);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer, 0, inputStream.available());

            for (int i = 0; i < buffer.length; i++) {
                char c = (char) buffer[i];
                if (c != '\n' && c != ' ') {
                    arrayList.add((char) buffer[i]);
                }
            }

            System.out.println(arrayList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}