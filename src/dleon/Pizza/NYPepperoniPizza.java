package dleon.Pizza;

import dleon.Enumeration.TypeOfDough;
import dleon.Enumeration.TypeOfSauce;
import dleon.Enumeration.TypeOfTopping;

public class NYPepperoniPizza extends Pizza {
    public NYPepperoniPizza(){
        name = "NY Pepperoni Pizza";
        dough = TypeOfDough.THINCRUST;
        sauce = TypeOfSauce.MARINARA;
        topping.add(TypeOfTopping.GRATEDREGGIANOCHEESE);
    }
}
