public abstract class Shape2D
{
    protected final static double PI = 3.14;
    protected double height;
    protected double radius;
    protected double width;

    public Shape2D(double height, double width, double radius)
     {
        this.height = height;
        this.width = width;
         this.radius = radius;
     }

    public double getHeight()
     {
         return this.height;
     }

    public double getRadius()
     {
         return this.radius;
     }

    public double getWidth()
     {
         return this.width;
     }

    abstract double getArea();

    public String toString()
     {
         return this.getClass().getSimpleName()+ "  ---> Area : " + this.getArea();
     }

}