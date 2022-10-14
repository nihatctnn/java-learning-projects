public class Duck extends Animal implements IFlyable, ISwimmable
{

    @Override
    public void move()
    {
        System.out.println("Duck moves.");
    }

   @Override
   public void fly()
    {
        System.out.println("Duck flies.");
    }

    @Override
    public void swim()
    {
        System.out.println("Duck swims.");
    }

}