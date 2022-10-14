public class Main
{
    public static void main(String[] args)
     {
       Shape a = new Square(5);        // downcasting
       Shape b = new Circle(4);

       ((Square)a).method1();              // downcasting
       a.draw();
       System.out.println("Area : " + a.area);

       System.out.println("----------------");

       ((Circle)b).method2();
       b.draw();
       System.out.println("Area : " + b.area);

     }
}