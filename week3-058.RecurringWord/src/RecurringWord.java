
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word:");
            String input = reader.nextLine();
            if (words.contains(input)) {
                System.out.println("You gave the word " + input + " twice.");
                break;
            } else {
                words.add(input);
            }
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
