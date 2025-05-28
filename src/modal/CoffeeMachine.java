package modal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CoffeeMachine {
    private final Map<Coffee, Integer> coffees;
    private boolean hasPower = true;
    private boolean hasWater = true;

    public CoffeeMachine() {
        this.coffees = new HashMap<>();
    }

    public void addCoffee(Coffee coffee, int quantity) {
        coffees.put(coffee, coffees.getOrDefault(coffee, 0) + quantity);
    }

    public void setPower(boolean power) {
        this.hasPower = power;
    }

    public void setWater(boolean water) {
        this.hasWater = water;
    }

    public Coffee serveCoffee(Coffee coffee, Money money) {
        if (!coffees.containsKey(coffee) || coffees.get(coffee) <= 0) {
            throw new IllegalStateException("Sold out");
        }

        if (!hasPower) {
            throw new RuntimeException("Power outage");
        }

        if (!hasWater) {
            throw new IllegalStateException("Out of water");
        }

        money.pay(coffee.getPrice());
        coffees.put(coffee, coffees.get(coffee) - 1);

        return coffee;
    }

    public List<Coffee> getAvailableCoffees() {
        return new ArrayList<>(coffees.keySet());
    }
}