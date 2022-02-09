package dleon.PizzaStore;

import dleon.Enumeration.TypeOfPizza;
import dleon.Pizza.*;

public class ChikagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(TypeOfPizza typeOfPizza) {
        switch (typeOfPizza) {
            case CHEESE:
                return new ChikagoChizzePizza();
            case PEPPERONI:
                return new ChikagoPepperoniPizza();
            default:
                return null;
        }
    }
}
