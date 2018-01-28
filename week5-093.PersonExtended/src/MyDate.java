
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        int difference = 0;
        if (year > comparedDate.year) {
            difference = year - comparedDate.year;
            if (month - comparedDate.month < 0) {
                difference--;
            }
            if (comparedDate.month == month) {
                if (day - comparedDate.day < 0) {
                    difference--;
                }
            }
        } else if (year < comparedDate.year) {
            difference = comparedDate.year - year;
            if (comparedDate.month - month < 0) {
                difference--;
            }
            if (comparedDate.month == month) {
                if (comparedDate.day - day < 0) {
                    difference--;
                }
            }
        }
        return difference;
    }

  
}