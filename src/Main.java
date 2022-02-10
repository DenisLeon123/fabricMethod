import static dleon.Enumeration.TypeOfPizza.*;
import dleon.PizzaStore.ChikagoPizzaStore;
import dleon.PizzaStore.NYPizzaStore;

public class Main {

    public static void main(String[] args) {

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza(PEPPERONI);

        ChikagoPizzaStore chikagoPizzaStore = new ChikagoPizzaStore();
        chikagoPizzaStore.orderPizza(CHEESE);

    }
}
