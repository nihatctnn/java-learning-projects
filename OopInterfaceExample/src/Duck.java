public class Duck extends Animal implements IMoveable,IFlyable, ISwimmable
{

    public Duck(String name)
     {
         super(name);
     }

    @Override
    public void move()
     {
         System.out.println("Duck is moving...");
     }

    @Override
    public void fly()
     {
         System.out.println("Duck is flying...");
     }

    @Override
    public void swim()
     {
         System.out.println("Duck is swimming...");
     }

}