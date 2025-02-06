import java.util.Random;

public class PasswordGenerator {

    public static String generatePassword(String prefix, int numericLength) {
        Random random = new Random();
        StringBuilder password = new StringBuilder(prefix);
        password.append(".");

        for (int i = 0; i < numericLength; i++) {
            password.append(random.nextInt(10));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        String prefix = "user";
        int numericLength = 4;
        // change prefix/length to make a new password // 

        String password = generatePassword(prefix, numericLength);
        System.out.println("Generated password: " + password);
    }
}