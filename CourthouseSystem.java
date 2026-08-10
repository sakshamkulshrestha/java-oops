// We use <T> as a placeholder for whatever Type this box will eventually hold
class ArchiveFolder<T> {
    private T record;

    public ArchiveFolder(T record) {
        this.record = record;
    }

    public T getRecord() {
        return record;
    }
}

public class CourthouseSystem {
    public static void main(String[] args) {
        ArchiveFolder<String> documentBox = new ArchiveFolder<>("Case 99: Dismissed");
        
        ArchiveFolder<Double> weaponSerialBox = new ArchiveFolder<>(500.50);
        
        
        System.out.println("Document recovered: " + documentBox.getRecord());
        System.out.println("Weapon serial logged: " + weaponSerialBox.getRecord());
    }
}