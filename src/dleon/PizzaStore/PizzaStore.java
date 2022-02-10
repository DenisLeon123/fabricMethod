package dleon.PizzaStore;

import dleon.Enumeration.TypeOfPizza;
import dleon.Pizza.*;

public abstract class PizzaStore {
    public Pizza orderPizza(TypeOfPizza typeOfPizza){
        Pizza pizza;

        pizza = createPizza(typeOfPizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(TypeOfPizza typeOfPizza);
}
