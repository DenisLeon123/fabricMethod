import static dleon.Enumeration.TypeOfPizza.*;

import dleon.FabricStore;
import dleon.PizzaStore.ChikagoPizzaStore;
import dleon.PizzaStore.NYPizzaStore;

public class Main {

    private static FabricStore fabricStore = FabricStore.getInstance();

    public static void main(String[] args) {
        fabricStore.getPizzaStore(new NYPizzaStore(), PEPPERONI);
        fabricStore.getPizzaStore(new ChikagoPizzaStore(), CHEESE);
    }
}
