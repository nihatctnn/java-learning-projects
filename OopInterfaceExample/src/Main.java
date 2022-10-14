public class Main
{
    public static void main(String[] args)
     {
        Duck duck1 = new Duck("Ducky");
        Eagle eagle1 = new Eagle("Buzz");
        Cat cat1 = new Cat("Tom");

        System.out.println("\n--- Duck ---\n");

        duck1.fly();
        duck1.move();
        duck1.swim();

        System.out.println("\n--- Eagle ---\n");

        eagle1.fly();

        System.out.println("\n--- Cat ---\n");

        cat1.swim();

     }
}