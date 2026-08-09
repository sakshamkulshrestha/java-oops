enum ReactorStatus{
    COLD_STANDBY,
    POWER_ASCENSION,
    CRITICAL,
    SCRAM_TRIGGERED
}

public class ReactorStateTester {
    public static void main(String[] args) {
        ReactorStatus obj = ReactorStatus.SCRAM_TRIGGERED;
        
        if(obj == ReactorStatus.SCRAM_TRIGGERED){
            System.out.println("EMERGENCY: Immediate coolant injection required!, Complete it Please.");
        }
    }
}
