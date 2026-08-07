import java.io.File;

public class DocumentShredder {
    public static void main(String[] args) {
        
        File sealedRecord = new File("Client_Smith_NDA.txt");
        
        if (sealedRecord.delete()) {
            System.out.println("Record expunged: " + sealedRecord.getName() + " has been destroyed.");
        } else {
            System.out.println("Error: Could not locate or delete the specified record.");
        }
        
    }
}