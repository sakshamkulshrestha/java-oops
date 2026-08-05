interface FlightController{
    void takeOff();
    void land();
}

class Quadcopter implements FlightController{

    @Override
    public void takeOff() {
        System.out.println("Engaging 4 rotors for vertical takeoff.");
    }

    @Override
    public void land() {
        System.out.println("Decreasing rotor RPM for touchdown.");
    }

}

public class DroneTesting {
    public static void main(String[] args) {
        Quadcopter obj = new Quadcopter();
        obj.takeOff();
        obj.land();
    }
}
