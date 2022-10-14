public class Rectangle extends Shape2D
{
    public Rectangle(double height, double width)
     {
        super(height, width,0);
     }

     @Override
     public double getArea()
      {
          return  getHeight() * getWidth();
      }

}