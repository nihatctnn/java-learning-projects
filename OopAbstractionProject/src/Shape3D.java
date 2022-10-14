public abstract class Shape3D extends Shape2D
{
    private double depth;

    public Shape3D(double depth, double height, double width)
     {
         super(height, width, 0);
         this.depth = depth;
     }

    public Shape3D( double height, double radius)
     {
         super(height, 0, radius);
     }

    public double getDepth()
     {
        return depth;
     }

    public abstract double getVolume();

    @Override
    public String toString()
     {
         return super.toString()+ "  ---> Volume : " + this.getVolume();
     }

}