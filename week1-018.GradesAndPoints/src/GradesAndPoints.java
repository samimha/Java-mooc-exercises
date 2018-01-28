
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]:");
        int points = Integer.parseInt(reader.nextLine());
        int grade = 0;
        if(points <= 29)
            System.out.println("Grade: failed");
        else if(points <= 34)
            grade = 1;
        else if(points <= 39)
            grade = 2;
        else if(points <= 44)
            grade = 3;
        else if(points <= 49)
            grade = 4;
        else
            grade = 5;
        System.out.println("Grade: " + grade);
    }
}
