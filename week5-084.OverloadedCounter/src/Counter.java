/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sami
 */
public class Counter {

    private int value;
    boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.value = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.value = 0;
        this.check = check;
    }

    public Counter() {
        this.value = 0;
        this.check = false;
    }

    public int value() {
        return value;
    }

    public void decrease() {
        if (check == true) {
            if (value > 0) {
                value--;
            }
        } else {
            value--;
        }
    }

    public void increase() {
        value++;
    }

    public void decrease(int amount) {
        if (amount > 0) {
            if (check == true) {
                if (value - amount >= 0) {
                    value -= amount;
                }
                else{
                    value = 0;
                }
            } else {
                value -= amount;
            }
        }
    }

    public void increase(int amount) {
        if (amount > 0) {
            value += amount;
        }
    }
}
