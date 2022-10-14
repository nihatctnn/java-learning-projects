public class Fish extends Animal implements ISwimmable
{

   @Override
   public void move()
    {
        System.out.println("Fish moves.");
    }

   @Override
   public void swim()
    {
        System.out.println("Fish swims.");
    }

}