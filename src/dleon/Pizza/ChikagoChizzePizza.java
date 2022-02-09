package dleon.Pizza;

import dleon.Enumeration.TypeOfDough;
import dleon.Enumeration.TypeOfSauce;
import dleon.Enumeration.TypeOfTopping;

import java.util.Arrays;

public class ChikagoChizzePizza extends Pizza {
    public ChikagoChizzePizza(){
        name = "Chikago Chizze Pizza";
        dough = TypeOfDough.THINCRUST;
        sauce = TypeOfSauce.PLUMTOMATO;
        topping.addAll(
                Arrays.asList(TypeOfTopping.GRATEDREGGIANOCHEESE, TypeOfTopping.SHREDDEDMOZZARELLACHEESE)
        );
    }
}
