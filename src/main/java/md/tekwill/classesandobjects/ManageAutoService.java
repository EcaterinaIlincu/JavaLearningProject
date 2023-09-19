package md.tekwill.classesandobjects;

import md.tekwill.classesandobjects.autoservicetask.Car;
import md.tekwill.classesandobjects.autoservicetask.Garage;
import md.tekwill.classesandobjects.autoservicetask.Person;
import md.tekwill.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {

    public static void main(String[] args) {
        Garage autoDocGarage;
        autoDocGarage = new Garage();
        autoDocGarage.address = "Stefan cel Mare";
        autoDocGarage.surfaceM2 = 450.0f;


        System.out.println("Obiectul AutoDoc garage are urmatoarele proprietati " + autoDocGarage.address + "  " + autoDocGarage.surfaceM2 + "  " + autoDocGarage.capacity);

        autoDocGarage.capacity = 40;

        System.out.println("Obiectul AutoDoc garage are urmatoarele proprietati: " + autoDocGarage.address + "  " + autoDocGarage.surfaceM2 + "  " + autoDocGarage.capacity);


        Garage garageIaloveni = new Garage();

        System.out.println("Obiectul Ialoveni garage are urmatoarele proprietati " + garageIaloveni.address + "  " + garageIaloveni.surfaceM2 + "  " + garageIaloveni.capacity);

        garageIaloveni.address = "Strada Plopilor 3";
        garageIaloveni.surfaceM2 = 369.3F;
        garageIaloveni.capacity = 3;

        System.out.println("Obiectul Ialoveni garage are urmatoarele proprietati " + garageIaloveni.address + "  " + garageIaloveni.surfaceM2 + "  " + garageIaloveni.capacity);

        Worker vasile = new Worker();
        vasile.name = "Vasile";
        vasile.age = 54;

        System.out.println("Obiectul nostru are numele de " + vasile.name + " si varsta de " + vasile.age + " ani");


        Worker ion = new Worker();
        ion.name = "Ion";

        System.out.println("Obiectul nostru are numele de " + ion.name + " si varsta de " + ion.age + " ani");


        Person client1 = new Person("+3734858586886");

        Car porscheWEE666 = new Car("frr34rf33f4f35f", "Porsche Cayene", client1);

        Car fordQQQ444 = new Car("frrfrr66rf66r", "Ford Fusion",
                new Person("+373445435646"));

        System.out.println("Masina noastra este " + porscheWEE666.mark + " cu vin code-ul " + porscheWEE666.vinCode + " si proprietarul poate fi apelat la: " + porscheWEE666.owner.phoneNumber);
        System.out.println("Masina noastra este " + fordQQQ444.mark + " cu vin code-ul " + fordQQQ444.vinCode + " si proprietarul poate fi apelat la: " + fordQQQ444.owner.phoneNumber);


    }
}
