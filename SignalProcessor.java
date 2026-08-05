class SensorSignal{
    public void analyze(){
        System.out.println("Analyzing raw sensor data.");
    }
}

class AcousticSignal extends SensorSignal{
    public void analyze(){
        System.out.println("Applying Fast Fourier Transform to acoustic waves.");
    }
}

class ThermalSignal extends  SensorSignal{
    public void analyze(){
        System.out.println("Generating infrared heat map.");
    }
}

public class SignalProcessor {
    public static void main(String[] args) {
        SensorSignal obj = new AcousticSignal();
        obj.analyze();

        obj = new ThermalSignal();
        obj.analyze();
    }
}
