
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("From what?");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Until what?");
        int last = Integer.parseInt(reader.nextLine());
        for (int i = first; i <= last; i++){
            sum += i;
        }
        System.out.println("Sum is" + sum);
    }
}
