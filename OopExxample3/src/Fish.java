public class Fish extends Animal
{
    private int sizeInFt;
    private boolean canEat;

    public void swim()
    {
      System.out.println("It can swim.");
    }

    public int getSizeInFt()
      {
        return sizeInFt;
      }

    public void setSizeFt(int sizeInFt)
      {
        this.sizeInFt = sizeInFt;
      }

    public boolean isCanEat(boolean x)
       {
         return canEat = true;
       }

}