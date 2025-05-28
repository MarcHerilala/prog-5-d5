package modal;

public class Money {
    private int amount;

    public Money(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int pay(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (amount < price) {
            throw new IllegalStateException("Insufficient funds");
        }
        amount -= price;
        return amount;
    }

}
