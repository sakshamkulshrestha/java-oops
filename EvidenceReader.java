import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvidenceReader {
    public static void main(String[] args) {
        File courtDoc = new File("Client_Smith_NDA.txt");

        try(Scanner reader = new Scanner(courtDoc)) {
            System.out.println("--- BEGINNING DOCUMENT REVIEW ---");
            while (reader.hasNextLine()) {
                String lineOfText = reader.nextLine();
                System.out.println(lineOfText);
            }
            System.out.println("--- END OF DOCUMENT ---");
        } catch (FileNotFoundException e) {
            System.out.println("Case Dismissed: The requested document is missing from the archives.");
        }
    }
}
