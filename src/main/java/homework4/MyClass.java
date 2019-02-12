package homework4;

import java.io.FileInputStream;
import java.io.IOException;

public class MyClass {
    static byte[] buf = new byte[10];

    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("test.txt")) {
            int   count;
            while ((count = in.read(buf)) > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.print((char) buf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
