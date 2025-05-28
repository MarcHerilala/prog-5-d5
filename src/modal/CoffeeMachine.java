package modal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeMachine {
    private final Map<Coffee, Integer> coffees;
    private boolean hasPower = true;
    private boolean hasWater = true;

    public CoffeeMachine() {
        this.coffees = new HashMap<>();
    }

    public void addCoffee(Coffee coffee, int quantity) {
        coffees.put(coffee, coffees.getOrDefault(coffee, 0) + quantity);
    }

  

    public Coffee serveCoffee(Coffee coffee, Money money) throws Exception {
        if (!coffees.containsKey(coffee) || coffees.get(coffee) <= 0) {
            throw new Exception("Sold out");
        }

        if (!this.hasPower) {
            throw new Exception("Power outage");
        }

        if (!hasWater) {
            throw new Exception("Out of water");
        }

        money.pay(coffee.getPrice());
        coffees.put(coffee, coffees.get(coffee) - 1);

        return coffee;
    }

    public List<Coffee> getAvailableCoffees() {
        return new ArrayList<>(coffees.keySet());
    }
}