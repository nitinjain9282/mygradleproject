package info.garagesalesapp.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by jamesharmon on 5/1/17.
 */
public class SaleEvent {

    // Defining variables
    private String id;
    private String streetAddress;
    private String city;

    // Define getter and setter methods for variables.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Define toString method and override it. More about overriding https://www.geeksforgeeks.org/method-overriding-with-access-modifier/
    /* In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by its super-class or parent class. When a method in a subclass has the same name, same parameters or signature and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
Method overriding is one of the ways by which java achieve Run Time Polymorphism. The version of a method that is executed will be determined by the object that is used to invoke it. If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed. In other words, it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.
we can see that we've overridden the two string method, so we're printing out a simple string to show the values of the properties in this SaleEvent.
     */
    @Override
    public String toString() {
        return "SaleEvent: " +
                id +
                ", " + streetAddress +
                ", " + city;
    }

    // Main method to test this class, it provide output of saleEvent object String.
    public static void main(String[] args) {
        SaleEvent saleEvent = new SaleEvent();
        saleEvent.setId("100");
        saleEvent.setStreetAddress("123 Main St.");
        saleEvent.setCity("Naperville");

        System.out.println(saleEvent.toString());

    //  gson is google developed opensource library to parse object to json form.I have added Gson builder class and used toJson method in it to which I have
   //   passed saleEvent object.

        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(saleEvent);
        System.out.println(json);

    }
}
