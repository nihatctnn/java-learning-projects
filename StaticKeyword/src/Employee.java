public class Employee
{
    public static String companyName = "MNG";
    private int id;
    private String name;
    static int number = 6;

    public Employee(int id, String name)
      {
          this.id = id;
          this.name = name;

          number++;
      }

    public void getInfo()
      {
          System.out.println(this.id + "" + this.name + "" + Employee.companyName);
      }

}