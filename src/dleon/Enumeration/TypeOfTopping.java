package dleon.Enumeration;

public enum TypeOfTopping {
    GRATEDREGGIANOCHEESE("Grated Reggiano Cheese"),
    SHREDDEDMOZZARELLACHEESE("Shredded Mozarella Cheeze");

    private final String name;

    TypeOfTopping(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
