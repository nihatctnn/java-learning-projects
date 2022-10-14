public class Cylinder extends Shape3D
{
    public Cylinder(double height, double radius)
     {
        super(height, radius);
     }

    @Override
    public double getVolume()
     {
         return PI * getRadius() * getRadius() * getHeight();  // we set radius to width in super class
     }

    @Override
    public double getArea()
      {
          return 2 * PI * getRadius() * (getRadius() + getHeight());
      }

}