import java.util.Scanner;

public class EvidenceCategorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contractAction = "Character Output Stream";
        String wiretapAction = "Byte Input Stream";

        System.out.println("To save a legal document, use a: " + contractAction);
        System.out.println("To load an audio recording, use a: " + wiretapAction);

        sc.close();

    }
}
