package model;

public enum Plan {
    BASIC("BASIC",500),
    PREMIUM("PREMIUM",600),
    ULTRA("ULTRA",800);

    private String name;
    private int price;

    //constructor
    Plan(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }
    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
