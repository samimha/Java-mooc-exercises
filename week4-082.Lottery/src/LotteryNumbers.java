import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        random = new Random();
        this.drawNumbers();
        
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        while(numbers.size() != 7){
            int draft = random.nextInt(39)+1;
            if(!containsNumber(draft))
                numbers.add(draft);
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if(numbers.contains(number))
            return true;
        else
            return false;
    }
}
