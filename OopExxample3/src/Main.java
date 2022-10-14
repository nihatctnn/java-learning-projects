public class Main
{
    public static void main(String[] args)
     {
        Duck duck = new Duck();
        Fish fish = new Fish();
        Zebra zebra = new Zebra();

        System.out.println("Animal : Duck");
        duck.age = 2;
        duck.gender = "Female";
        System.out.println("Age : " + duck.age + "\n" + "Gender : " + duck.gender + "\n" + "Beak Color : " + duck.beakColor);
        duck.swim();
        duck.quack();
        duck.mate();

        System.out.println("\n");

        System.out.println("Animal : Whale");
        fish.age = 5;
        fish.gender = "Male";
        fish.setSizeFt(20);
        System.out.println("Age : " + fish.age + "\n" + "Gender : " + fish.gender + "\n" + "Size (m) : " + fish.getSizeInFt() + "\n" + "Can it eat ? :" + fish.isCanEat(true));
        fish.swim();
        fish.isMammal();

        System.out.println("\n");

        System.out.println("Animal : Zebra");
        zebra.age = 8;
        zebra.gender = "Male";
        zebra.isWild = true;
        System.out.println("Age : " + zebra.age + "\n" + "Gender : " + zebra.gender + "\n" + "Is it wild ? :" + zebra.isWild );
        zebra.isMammal();
        zebra.run();

     }
}