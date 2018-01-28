import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        boolean pal;
        String rev = "";
        for (int i = text.length() - 1; i > -1; i--) {
            rev = rev + text.charAt(i);
        }
        if(text.equals(rev))
            pal = true;
        else
            pal = false;
        return pal;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
