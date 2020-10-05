package org.oops.modifiers;

public class Vechile {

    private String id; // inside the class.
    private String type; // inside the class. bus, truck, 2 wheller, 4 wheller
    public String registrationState; // outside the class, any package
    String color;// outside the class , within same package

    // to make your fields private
    // public setter & getter


    public Vechile(String id, String type, String color) {
        this.id = id;
        this.type = type;
        this.color = color;
    }

    public Vechile() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegistrationState() {
        return registrationState;
    }

    public void setRegistrationState(String registrationState) {
        if(registrationState == null){
            this.registrationState = "DL";
        }
        else {
            this.registrationState = registrationState;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
