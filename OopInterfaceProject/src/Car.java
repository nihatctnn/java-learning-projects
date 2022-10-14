public class Car implements IDriveable
{

    @Override
    public void start()
     {
        System.out.println("The car has been started.");
     }

    @Override
    public void forward()
     {
         System.out.println("The car moves forward.");
     }

    @Override
    public void turn(double angle)
     {
         System.out.println("The car turns " + angle + " clockwise.");
     }

    @Override
    public void stop()
     {
         System.out.println("The car has been stopped.");
     }

}