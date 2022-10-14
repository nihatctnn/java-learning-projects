public class Bicycle implements IDriveable
{

    @Override
    public void start()
     {
         System.out.println("The bicycle has been started.");
     }

    @Override
    public void forward()
     {
         System.out.println("The bicycle moves forward.");
     }

    @Override
    public void turn(double angle)
     {
        System.out.println("The bicycle turns " + angle + " clockwise.");
     }

    @Override
    public void stop()
     {
         System.out.println("The bicycle has been stopped.");
     }

}