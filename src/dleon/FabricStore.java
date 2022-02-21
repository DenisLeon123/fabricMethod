package dleon;

import dleon.Enumeration.TypeOfPizza;
import dleon.Pizza.Pizza;
import dleon.PizzaStore.PizzaStore;

public class FabricStore {
    private static FabricStore instance;

    private FabricStore(){}

    public static FabricStore getInstance(){
        if(instance == null){
            instance = new FabricStore();
        }

        return instance;
    }

    public Pizza getPizzaStore(PizzaStore pizzaStore, TypeOfPizza top){
        return pizzaStore.orderPizza(top);
    }
}
