package org.oops.thiscontructor.cyclic;

// will this code compile. if yes what is the output
public class Product {

    private int id;
    private int price;

    public Product(int id) { // one-param constructor
      //  this(id, 100 ); // enable this line to see cyclic constrcutor invocation. compilation error.
        this.id = id;
    }

    public Product(int id, int price) { // two-param constructor
        this(id); // first line in your constructor
        this.id = id;
        this.price = price;
    }
}
