package md.tekwill.accessmodifiers;


import md.tekwill.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        Person cristina = new Person();
        System.out.println(cristina.isRetired);

        cristina.isRetired = true;

        if (cristina.isRetired) {
            System.out.println("Cristina is retired");
        } else {
            System.out.println("Cristina is not retired");
        }


        Person eliza = new Person(2344555l, "Eliza", "Married", true);
        eliza.isRetired = true;
        System.out.println("Available Info about eliza is : " + eliza.isRetired);

        if (eliza.isRetired) {
            System.out.println("Eliza is retired");
        } else {
            System.out.println("Eliza is not retired");
        }

        Person marcel = new Person(533646565l, "Marcel");
        System.out.println("Avaialble info about Marcel: " + marcel.isRetired);

        if (marcel.isRetired) {
            System.out.println("Marcel is retired");
        } else {
            System.out.println("Marcel is not retired");
        }

        System.out.println(Person.hasHeart);
        Person.hasBrain = true;
        System.out.println(Person.hasBrain);


    }
}
