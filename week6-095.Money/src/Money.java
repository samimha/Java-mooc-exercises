
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money sum = new Money(euros + added.euros, cents + added.cents);
        return sum;
    }

    public boolean less(Money compared) {
        if (euros < compared.euros) {
            return true;
        }
        if (euros == compared.euros && cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {
        //Money decrease;
        if (less(decremented)) {
            return new Money(0, 0);
        } else {
            if(cents < decremented.cents){
                return new Money(euros - decremented.euros - 1, cents - decremented.cents + 100);
            }
            return new Money(euros - decremented.euros, cents - decremented.cents);
        }
        
    }
}
