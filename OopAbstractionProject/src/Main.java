public class Main
{
    public static void main(String[] args)
     {
        Shape2D s1 = new Circle(3.0);
        System.out.println(s1.toString());

        Shape2D s2 = new Square(3.0);
        System.out.println(s2.toString());

        Shape2D s3 = new Rectangle(5.1,2.0);
        System.out.println(s3.toString());

        Shape3D s4 = new Cylinder(5.0, 5.0);
        System.out.println(s4.toString());

        Shape3D s5 = new Sphere(2 ,2.0);
        System.out.println(s5.toString());

        Shape3D s6 = new Cone(5.0, 4.2, 3.1);
        System.out.println(s6.toString());

     }
}