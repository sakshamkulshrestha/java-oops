import java.io.FileWriter;
import java.io.IOException;

public class ContractDrafter {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("Client_Smith_NDA.txt")){
            writer.write("Clause 1: The Client agrees to keep all proprietary algorithms strictly confidential.");
            System.out.println("NDA terms successfully drafted.");
        }
        catch(IOException e){
            System.out.println("Clerk Error: Unable to write to the court document.");
            e.printStackTrace();
        }
    }
}
