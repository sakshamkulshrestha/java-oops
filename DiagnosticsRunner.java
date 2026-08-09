interface SystemDiagnostics{
    void runScan();
}

public class DiagnosticsRunner {
    public static void main(String[] args) {
        SystemDiagnostics obj = () -> {
            System.out.println("Scanning thermal exhaust ports for anomalies...");
        };

        obj.runScan();
    }
}
