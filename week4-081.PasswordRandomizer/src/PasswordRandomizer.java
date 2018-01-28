import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;
    // Define the variables

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();
        // Initialize the variable
    }

    public String createPassword() {
        String password = "";
        String characters = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < length; i++)
            password += characters.charAt(random.nextInt(characters.length()));
        
        // write code that returns a randomized password
        return password;
    }
}
