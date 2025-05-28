package modal;

public class Money {
    private int amount;

    public Money(int amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Amount cannot be negative");
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int pay(double price) throws Exception {
        if (price < 0) {
            throw new Exception("Price cannot be negative");
        }
        if (amount < price) {
            throw new Exception("Insufficient funds");
        }
        amount -= price;
        return amount;
    }

}
