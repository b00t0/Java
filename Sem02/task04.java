/*
Задание No4
📌 Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
import java.io.FileWriter;

public class task04 {
    public static void main(String[] args) {
        String str = "TEST";
        int n = 100;
        String newStr = stringMaker(str, n);
        String fileName = "text.txt";
        writeToFile(newStr, fileName);
    }

    public static String stringMaker(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

    public static void writeToFile(String str, String fileName) {
        try (FileWriter fw = new FileWriter(fileName, true)) {   // true for rewrite
            fw.write(str);
            fw.write(System.lineSeparator());
            System.out.println("Succesfully recorded");
        } catch (Exception e) {
            System.err.println("Error while recording");
        }
    }
}
