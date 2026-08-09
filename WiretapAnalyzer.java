import java.io.FileInputStream;
import java.io.IOException;

public class WiretapAnalyzer {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("Client_Smith_NDA.txt")) {
            int i;

            while((i = input.read()) != -1){
                System.out.print(i + " ");
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
