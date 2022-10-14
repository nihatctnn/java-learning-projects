public class Square extends Shape2D
{
    public Square (double width)
     {
         super(width, width,0);
     }

    @Override
    public double getArea()
      {
          return getWidth() * getWidth();
      }

}