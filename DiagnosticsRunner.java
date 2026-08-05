interface SystemDiagnostics{
    void runScan();
}

public class DiagnosticsRunner {
    public static void main(String[] args) {
        SystemDiagnostics obj = new SystemDiagnostics() {
            @Override
            public void runScan(){
                System.out.println("Scanning thermal exhaust ports for anomalies...");
            }
        };

        obj.runScan();
    }
}
