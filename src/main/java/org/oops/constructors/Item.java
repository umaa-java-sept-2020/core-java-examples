package org.oops.constructors;

public class Item {

    public int id;
    public String name;
    public int unityPrice;


    // default constructor will not be added automatically. user need to add manually
    // because we have defined below parametrized constructor

    public Item(int id, String name, int unityPrice) {
        this.id = id;
        this.name = name;
        this.unityPrice = unityPrice;
    }
}
