package task6.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    private static final String FILE_PATH = "tms.txt";

    public static void main(String[] args) throws IOException {
        String string = getStringFromUser();
        writeToFile(string, FILE_PATH);
        System.out.println(readFromFile(FILE_PATH));
    }

    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void writeToFile(String string, String path) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path)) {
            fileOutputStream.write(string.getBytes());
        }
    }

    private static String readFromFile(String path) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            byte[] bytes = new byte[fileInputStream.available()];
            int count = fileInputStream.read(bytes);
            if (count < 0) {
                throw new IOException("file is empty");
            }

            return new String(bytes);
        }
    }
}
