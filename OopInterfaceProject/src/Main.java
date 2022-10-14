public class Main
{
    public static void main(String[] args)
    {
        IDriveable w1 = new Bicycle();        // Casting from a superclass to a subclass (downcasting)
        IDriveable w2 = new Car();

        w1.start();
        w1.forward();
        w1.turn(0.6);
        w1.stop();

        System.out.println("");

        w2.start();
        w2.forward();
        w2.turn(0.7);
        w2.stop();

    }
}