public class Circle extends Shape
{
    private double radius;

    public Circle(double radius)
     {
        this.radius = radius;
        area = 3.14 * (radius * radius);
     }

     public double getRadius()
      {
         return radius;
      }

     public void setRadius(double radius)
      {
         this.radius = radius;
      }

    public void method2()
    {
        System.out.println("Hello from Circle !");
    }

     @Override
     public void draw()
      {
        System.out.println("I am a Circle !");
      }
}