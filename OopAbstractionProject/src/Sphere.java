public class Sphere extends Shape3D
{

    public Sphere(int depth, double radius)
     {
        super(depth, radius);
     }

     @Override
     public double getVolume()
      {
        return (4 * (PI * getRadius() * getRadius() * getRadius())) / 3;
      }

     @Override
     public double getArea()
      {
          return 4 * PI * getRadius() * getRadius();
      }

}