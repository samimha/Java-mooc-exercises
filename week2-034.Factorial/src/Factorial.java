import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int fac = 1;
        System.out.println("Type a number:");
        int number = Integer.parseInt(reader.nextLine());
        for (int i = 1; i <= number; i++){
            fac *= i;
        }
        System.out.println("Factorial is " + fac);

    }
}
