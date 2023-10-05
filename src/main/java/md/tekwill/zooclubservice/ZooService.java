package md.tekwill.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal charlieDog = new Dog("Charlie", true);
        System.out.println(charlieDog.getName());

        charlieDog.eat();
        charlieDog.makeSound();

        Animal rocky = new Dog("Rocky");

        System.out.println(rocky.getName());

        Cat kittis = new Cat("kittis");
        kittis.eat();
        kittis.makeSound();
    }




}
