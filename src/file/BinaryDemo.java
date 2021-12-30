package file;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BinaryDemo {
    public static void main(String[] args) {
        writeFile();
    }
    public static void writeFile() {
        try {
            File file = new File("data\\test");
            if (!file.exists())
                file.createNewFile();

            FileOutputStream outputStream = new FileOutputStream(file,true);
            String goodbye = "Good bye Dan, Chuc Dan Binh An\nawfasef";
            outputStream.write(goodbye.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readFile() {
        try {
            long startMillis = System.currentTimeMillis();
            FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\front-dashboard.rar");
            int result;
            while ((result = fis.read()) > -1) {
            }
            fis.close();
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
