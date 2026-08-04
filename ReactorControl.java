class NuclearReactor{
    public String reactorId;
    private double coreTemperatureC;

    NuclearReactor(String reactorId, double coreTemperatureC){
        this.reactorId = reactorId;
        this.coreTemperatureC = coreTemperatureC;
    }

    public double getCoreTemperature(){
        return coreTemperatureC;
    }


}
public class ReactorControl {
    public static void main(String[] args) {
        NuclearReactor obj = new NuclearReactor("RBMK-1000", 850.5);
        System.out.println(obj.reactorId);
        System.out.println(obj.getCoreTemperature());
    }
}
