class HeartRateMonitor{
    private int bpm;

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        if(bpm >= 30 && bpm <= 250){
            this.bpm = bpm;
        }
        else{
            System.out.println("Warning: Abnormal heart rate detected.");
        }
    }
    
}

public class PatientMonitorSystem {
    public static void main(String[] args) {
        HeartRateMonitor obj = new HeartRateMonitor();
        obj.setBpm(75);
        System.out.println(obj.getBpm());

        obj.setBpm(300);
        System.out.println(obj.getBpm());
    }
}
