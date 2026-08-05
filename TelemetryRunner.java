abstract class TelemetrySystem{
    public void calibrate(){
        System.out.println("Calibrating telemetry sensors...");
    }

    public abstract void transmitData();
}

class SatelliteTelemetry extends TelemetrySystem{

    @Override
    public void transmitData() {
        System.out.println("Transmitting data via Ku-Band frequency.");
    }
    
}


public class TelemetryRunner {
    public static void main(String[] args) {
        SatelliteTelemetry obj = new SatelliteTelemetry();
        obj.calibrate();
        obj.transmitData();
    }
}
