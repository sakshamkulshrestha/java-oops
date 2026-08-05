class OrbitalModule{
    OrbitalModule(String moduleName){
        System.out.println("Initializing module: " + moduleName);
    }

    public void deploy(){
        System.out.println("Deploying basic solar arrays.");
    }
}

class CommunicationSatellite extends OrbitalModule{

    CommunicationSatellite(String moduleName) {
        super(moduleName);
        System.out.println("Communication satellite systems online.");
    }

    public void deploy(){
        super.deploy();
        System.out.println("Deploying high-gain directional antenna.");
    }
    
}


public class SatelliteDeployment {
    public static void main(String[] args) {
        OrbitalModule obj = new CommunicationSatellite("Satcom-1");
        obj.deploy();
    }
}
