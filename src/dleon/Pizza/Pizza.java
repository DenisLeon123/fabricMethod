package dleon.Pizza;

import dleon.Enumeration.*;
import java.util.ArrayList;

public abstract class Pizza {
    String name;
    TypeOfDough dough;
    TypeOfSauce sauce;
    ArrayList<TypeOfTopping> topping = new ArrayList<>();

    public void prepare(){
        System.out.println("***************************************");
        System.out.printf("Preparing %s\n", name);
        System.out.printf("Dought %s\n", dough.getName());
        System.out.printf("Sauce %s\n", sauce.getName());
        topping.forEach((e) -> System.out.printf("Topping %s\n", e.getName()));
    }

    public void bake(){}

    public void cut(){}

    public void box(){}

    public String getName(){
        return name;
    }
}
