class AtmosphericSensor{
    String targetGas;
    double concentrationPPM;
    boolean isCalibrated = false;
    
    public String getTargetGas() {
        return targetGas;
    }
    public double getConcentrationPPM() {
        return concentrationPPM;
    }
    public boolean isCalibrated() {
        return isCalibrated;
    }

    
}
public class AtmosphericSensorRunner {
    public static void main(String[] args) {
        AtmosphericSensor obj = new AtmosphericSensor();
        obj.targetGas = "Methane";
        obj.concentrationPPM = 405.2;

        System.out.println(obj.getTargetGas());
        System.out.println(obj.getConcentrationPPM());

    }
}
