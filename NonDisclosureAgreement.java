import java.io.File;
import java.io.IOException;

public class NonDisclosureAgreement {
    public static void main(String[] args) {
        File file = new File("Client_Smith_NDA.txt");
        try{
            if(file.createNewFile()){
                System.out.println("NDA drafted and ready for signature. " + file.getName());
            }
            else{
                System.out.println("NDA is already on file for this client.");
            }
        }
        catch(IOException e){
            System.out.println("Objection! System error preventing file creation.");
            e.printStackTrace();
        }
    }
}
