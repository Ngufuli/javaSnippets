public class PredatoryCreditCard extends CreditCard {
    // New instance variable
    private double apr; // Annual percentage rate

    // Constructor for this class
    public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double rate) {
        super(cust, bk, acnt, lim, initialBal); // initialized superclass attrubutes
    }

    // A new method for assessing monthly interest charges
    public void processMonth() {
        if (balance > 0) { // charge interest rate on positive balance
            double monthlyFactor = Math.pow(1 + apr, 1.0 / 12); // compute monthly rate
            balance *= monthlyFactor; // access interest
        }
    }

    // Overriding the charge method defined in superclass
    public boolean charge(double price) {
        boolean isSuccess = super.charge(price);
        if (!isSuccess)
            balance = +5;
        return isSuccess;
    }
}
