package dleon.Enumeration;

public enum TypeOfDough {
    THINCRUST("Thin Crust"),
    EXTRATHINCRUST("Extra Thick Crust");

    private final String name;

    TypeOfDough(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
