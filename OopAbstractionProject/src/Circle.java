public class Circle extends Shape2D
{
    public Circle(double radius)
     {
        super(0,0,radius);
     }

    @Override
    public double getArea()
     {
        return PI * Math.pow(this.getRadius(), 2);
     }

}