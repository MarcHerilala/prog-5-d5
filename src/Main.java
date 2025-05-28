
import modal.Coffee;
import modal.CoffeeMachine;
import modal.Money;

public class Main {
    public static void main(String[] args) throws Exception {
      Coffee expresso=new Coffee("Expresso", "hot", 2.5);
        Coffee cappuccino=new Coffee("Cappuccino", "hot", 3.0);
        Money money=new Money(1);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addCoffee(expresso, 2);
        coffeeMachine.addCoffee(cappuccino, 5);

        coffeeMachine.serveCoffee(expresso,money);
    }

}