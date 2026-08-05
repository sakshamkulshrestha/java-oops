class SecurityToken{
    private String encryptionStandard = "SHA-256";

    class Authenticator{
        public void generateHash(){
            System.out.println("Generating secure hash using: " + encryptionStandard);
        }
    }
}

public class TokenRunner {
    public static void main(String[] args) {
        SecurityToken obj = new SecurityToken();
        SecurityToken.Authenticator auth = obj.new Authenticator();

        auth.generateHash();
    }
}
