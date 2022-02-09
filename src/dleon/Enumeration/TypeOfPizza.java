package dleon.Enumeration;

public enum TypeOfPizza {
    CHEESE("cheeze"),
    VEGGIE("veggie"),
    CLAM("clam"),
    PEPPERONI("pepperoni");

    private final String name;

    TypeOfPizza(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
