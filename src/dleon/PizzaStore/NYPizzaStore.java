package dleon.PizzaStore;

import dleon.Enumeration.TypeOfPizza;
import dleon.Pizza.NYChezzePizza;
import dleon.Pizza.NYPepperoniPizza;
import dleon.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(TypeOfPizza typeOfPizza) {
        switch (typeOfPizza) {
            case CHEESE:
                return new NYChezzePizza();
            case PEPPERONI:
                return new NYPepperoniPizza();
            default:
                return null;
        }
    }
}
