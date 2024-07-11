import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test {

    public static void main(String[] args) {
        // Получаем текущую директорию
        String currentDirectory = System.getProperty("user.dir");

        // Получаем список файлов и папок в текущей директории
        String[] contentFolder = getFileList(currentDirectory);

        // Указываем путь к файлу FileList.txt
        String filePath = currentDirectory + File.separator + "FileList.txt";

        // Пишем содержимое директории в файл
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String item : contentFolder) {
                writer.write(item + System.lineSeparator());
            }
            System.out.println("Файл успешно создан: " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static String[] getFileList(String folderName) {
        File currentFolder = new File(folderName);
        return currentFolder.list();
    }
}