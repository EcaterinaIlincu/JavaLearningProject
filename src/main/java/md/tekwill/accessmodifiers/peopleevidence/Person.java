package md.tekwill.accessmodifiers.peopleevidence;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Person {

    // Class variable
    public static boolean hasHeart = true;
    public static boolean hasBrain;

    //instance Variable because it defines the objects of Person class
    private long idnp;

    // Default Instance variable
    String maritalStatus;

    // protected Instance variable
    protected String name;

    //Public instance variable
    public boolean isRetired;

    public Person() {
        System.out.println("This is a defined constructor without parameters");
    }

    public Person(long idnp, String nameInput) {
        this.idnp = idnp;
        name = nameInput;
        System.out.println("This is defined constructor with 2 parameters");
    }

    public Person(long idnp, String name, String maritalStatus, boolean isRetired) {

        this.idnp = idnp;
        this.maritalStatus = maritalStatus;
        this.name = name;
        this.isRetired = isRetired;
        System.out.println("This is defined constructor with all parameters");

    }


}
