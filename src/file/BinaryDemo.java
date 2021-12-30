package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryDemo {
    public static void main(String[] args) {
        try {
            long startMillis = System.currentTimeMillis();
            FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\front-dashboard.rar");
            int result;
            while ((result = fis.read()) > -1) {
            }
            System.out.println(System.currentTimeMillis() - startMillis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            long startMillis = System.currentTimeMillis();
            FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\front-dashboard.rar");
            byte[] bytes = new byte[10];
            while ((fis.read(bytes)) > -1) {
            }
            System.out.println(System.currentTimeMillis() - startMillis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
