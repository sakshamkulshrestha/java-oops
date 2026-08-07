public class MultiErrorProcessor {
    public static void main(String[] args) {
        int[] data = {50, 100, 150};
        int indexToAccess = 5; 
        int divisor = 0;       
        
        try {
            int calculation = data[indexToAccess] / divisor;
            System.out.println("Result: " + calculation);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide it by zero!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cant access the " + indexToAccess + " index, because it doesnt exist");
        }
        finally{
            System.out.println("checked all the errors!");
        }
    }
}