public class Cone extends Shape3D
{
    private double hipotenus;

    public Cone( double height, double radius, double hipotenus)
     {
        super(height, radius);
        this.hipotenus = hipotenus;
     }

     public double getHipotenus()
      {
          return hipotenus;
      }

    @Override
    public double getVolume()
     {
        return (PI * getRadius() * getRadius() * getHeight() / 3 );
     }

    @Override
    public double getArea()
     {
         return PI * getRadius() * (getRadius() + this.getHipotenus());
     }

}