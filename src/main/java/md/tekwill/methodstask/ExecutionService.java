package md.tekwill.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(20,100));
        System.out.println(DataGeneratorUtil.getRandomInt(100,120));
        System.out.println(DataGeneratorUtil.getRandomInt(120,100));

        int randomInt = DataGeneratorUtil.getRandomInt(-50);
        System.out.println(randomInt);

        System.out.println(DataGeneratorUtil.getRandomEmail("tekwill.md"));
        System.out.println(DataGeneratorUtil.getRandomEmail("tekwill.md"));
        System.out.println(DataGeneratorUtil.getRandomEmail("tekwill.md"));
        System.out.println(DataGeneratorUtil.getRandomEmail("tekwill.md"));

        Customer customer1 = new Customer("Alfredo", "masculin", 6567);
        String infoAboutCustomer1 = customer1.toString();
        System.out.println(infoAboutCustomer1);

        customer1.setAge(96);
        System.out.println(customer1.toString());

        Customer customer2 = new Customer("Selena", "feminin", 23);
        System.out.println(customer2.toString());

        customer1.setName("Selena Alfredo");
        System.out.println(customer1.toString());

        System.out.println("Varsta lui Alfredo este: " + customer1.getAge());
        System.out.println("Numele lui Alfredo este: " + customer1.getName());

    }

}
