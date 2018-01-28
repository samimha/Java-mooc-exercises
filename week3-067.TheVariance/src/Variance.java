import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum=0;
        for (int i = list.size()-1; i > -1; i--){
            sum += list.get(i);
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg = (double) sum(list) / list.size();
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double var = 0;
        double avg = average(list);
        for(int number : list){
            var += Math.pow(number-avg,2);
        }
        var /= (list.size() - 1);
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(4);
        
        System.out.println("The variance is: " + variance(list));
    }

}
