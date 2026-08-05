class NavigationGyroscope{
    double zAxisSpinRate = 0.0;
    
    public void applyTorque(double force){
        zAxisSpinRate += force * 1.5;
        System.out.println(zAxisSpinRate);
    }
}
public class NavigationGyroscopeRunner {
    public static void main(String[] args) {
        NavigationGyroscope obj = new NavigationGyroscope();
        obj.applyTorque(10);
    }
}
