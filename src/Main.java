import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Оберіть опцію:");
            System.out.println("1. Створити та записати файл");
            System.out.println("2. Читати файл");
            System.out.println("3. Вийти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введіть назву файлу (без розширення):");
                    String fileName = scanner.nextLine();
                    System.out.println("Введіть текстовий контент файлу:");
                    String content = scanner.nextLine();
                    FileWriteService.writeToFile(fileName, content);
                    break;
                case 2:
                    System.out.println("Введіть назву файлу (без розширення):");
                    String readFileName = scanner.nextLine();
                    String fileContent = FileReadService.readFromFile(readFileName);
                    if (fileContent != null) {
                        System.out.println("Зміст файлу: " + fileContent);
                    } else {
                        System.out.println("Файл не знайдено або виникла помилка при читанні.");
                    }
                    break;
                case 3:
                    System.out.println("До побачення!");
                    System.exit(0);
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
}
