public class Main
{
    public static void main(String[] args)
     {
        try
         {
            Student s = new Student(200,50);
            System.out.println(s.getAverage());
         }

        catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
     }
}