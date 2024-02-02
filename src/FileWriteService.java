import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    public static void writeToFile(String fileName, String content) {
        try (FileOutputStream fos = new FileOutputStream(BaseUrlConfig.BASE_URL + fileName + ".txt")) {
            byte[] contentBytes = content.getBytes();
            fos.write(contentBytes);
            System.out.println("Файл успішно створено та записано.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

