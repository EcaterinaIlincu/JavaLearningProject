package md.tekwill.zooclubservice;

public class Dog extends Animal {

    private boolean hasAGoodLife;

    public Dog(String nameOfTheDog, boolean hasAGoodLife){
        super(nameOfTheDog);
        this.hasAGoodLife = hasAGoodLife;
    }
    public Dog(String nameOfTheDog){
        super(nameOfTheDog);
    }
    @Override
    public void makeSound() {
        System.out.println("Wuf");
    }

    @Override
    public void eat() {
        System.out.println(" A dog is eating dogfood");
    }

public String getName(){
        return this.name + " - This is from the child class";
}

}
