package dleon.Enumeration;

public enum TypeOfSauce {
    MARINARA("Marinara Sauce"),
    PLUMTOMATO("Plum Tomato Sause");

    private final String name;

    TypeOfSauce(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
