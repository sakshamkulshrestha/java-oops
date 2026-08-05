class NetworkDevice{
    String protocol = "TCP/IP";

    public void transmitData(){
        System.out.println("Transmitting data packets...");
    }
}

class Router extends NetworkDevice{
    int totalPorts = 4;

    public void routeTraffic(){
        System.out.println("Routing traffic to specific ports.");
    }
}

public class NetworkTest {
    public static void main(String[] args) {
        Router obj = new Router();

        System.out.println(obj.protocol);
        obj.transmitData();
        System.out.println(obj.totalPorts);
        obj.routeTraffic();
    }
}
