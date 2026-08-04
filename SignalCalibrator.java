import java.util.Random;

public class SignalCalibrator {
    public static void main(String[] args) {
        Random random = new Random();
        int signalStrength = random.nextInt(100);
        System.out.println("Calibrated Signal Strength: " + signalStrength + "%");
    }
}
