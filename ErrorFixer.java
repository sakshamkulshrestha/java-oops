public class ErrorFixer {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        
        double average = x + y / 2; 
        
        System.out.println("The average is: " + average);
        
        int divider = 0;
        try{
            int result = 100 / divider;
            System.out.println("Result: " + result);
        }
        catch(Exception e){
            System.out.println("Cant divide it by zero");
        }
        
    }
}