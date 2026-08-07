public class ExceptionHandler {
    public static void main(String[] args) {
        int[] loginCodes = {101, 202, 303};
        
        // This will cause a crash. Wrap it in a try...catch...finally structure!
        try {
            System.out.println("Processing code: " + loginCodes[5]);
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("You cannot access that index!");
        }
        finally{
            System.out.println("Try and catch are over now!");
        }
    }
}