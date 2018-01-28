
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number:");
        int number2 = Integer.parseInt(reader.nextLine());
        
        if (number < number2){
            System.out.println("The bigger number of the two numbers given was:" + number2);
        }
        else {
            System.out.println("The bigger number of the two numbers given was:" + number);
        }
        // Implement your program here. Remember to ask the input from user
    }
}
