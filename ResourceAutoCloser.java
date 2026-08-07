import java.util.Scanner;

public class ResourceAutoCloser {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a magic number: ");
            int magicNumber = input.nextInt();
            System.out.println("Your magic number is: " + magicNumber);
        } catch (Exception e) {
            System.out.println("That is not a number!");
        }
        
    }
}