package snackBar;


public class Coin {

    private int cents;
    private final int quarters, dimes, nickels, pennies;

    public Coin(int n) {
        cents = n;

        quarters = n / 25;
        n %= 25;
        dimes = n / 10;
        n %= 10;
        nickels = n / 5;
        n %= 5;
        pennies = n;
    }

    public int getQuarters() {
        return quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public int getNickels() {
        return nickels;
    }

    public int getPennies() {
        return pennies;
    }

}
