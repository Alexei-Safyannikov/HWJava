package Sem002;
import java.io.FileWriter;
import java.io.IOException;

public class Task002 {

    // Напишите метод,
    // который составит строку,
    // состоящую из 100 повторений слова TEST
    // и метод, который запишет эту строку в простой текстовый файл,
    // обработайте исключения.


    
        public static void main(String[] args) {
            String str = "";
            for (int i = 1; i <= 100; i++) {
                str += "TEST ";
            }
            writeToFile(str, "test.txt");
        }
        
        public static void writeToFile(String str, String fileName) {
            try {
                FileWriter writer = new FileWriter(fileName);
                writer.write(str);
                writer.close();
                System.out.println("Successfully written to file " + fileName);
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }
}