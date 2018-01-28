
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        value++;
        if (value > upperLimit)
            value = 0;
    }

    public String toString() {
        if (value < 10)
            return "0" + value;
        else
            return "" + value;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int newValue){
        if (newValue >= 0 && newValue < upperLimit+1)
            value = newValue;
    }
}
