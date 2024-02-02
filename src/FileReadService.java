import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReadService {
    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(BaseUrlConfig.BASE_URL + fileName + ".txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }
}



