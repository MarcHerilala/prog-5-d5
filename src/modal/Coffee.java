package modal;

public class Coffee {
    private String name;
    private String type;
    private double price;

    public Coffee(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public double getPrice() {
        return this.price;
    }
}
