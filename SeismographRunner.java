class Seismograph{
    double sensitivity;
    String location;

    Seismograph(double sensitivity, String location){
        this.sensitivity = sensitivity;
        this.location = location;
    }

    public double getSensitivity() {
        return sensitivity;
    }

    public String getLocation() {
        return location;
    }
}

public class SeismographRunner {
    public static void main(String[] args) {
        Seismograph obj = new Seismograph(0.05, "Fault Line Alpha");
        System.out.println(obj.getSensitivity());
        System.out.println(obj.getLocation());
    }
}
