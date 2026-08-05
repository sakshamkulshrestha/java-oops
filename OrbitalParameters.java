import java.util.Scanner;

public class OrbitalParameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desired orbital altitude (in km): ");
        int altitude = sc.nextInt();
        System.out.println("Target altitude confirmed at: " + altitude + " km.");
        sc.close();
    }
}
