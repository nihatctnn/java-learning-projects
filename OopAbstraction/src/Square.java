public class Square extends Shape
{
    private double size;

    public Square(double size)
     {
        this.size = size;
        area = this.getSize() * this.getSize();
     }

    public double getSize()
     {
        return this.size;
     }

    public void setSize(double size)
     {
         this.size = size;
     }

    public void method1()
     {
         System.out.println("Hello from Square !");
     }

    @Override
    public void draw()
     {
        System.out.println("I am a Square !");
     }
}