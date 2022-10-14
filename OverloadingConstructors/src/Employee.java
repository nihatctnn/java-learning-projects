public class Employee
{
    protected String name;
    protected double salary;
    protected Date birthDate;

    public Employee(String name, double salary, Date birthDate)
     {
         this.name = name;
         this.salary = salary;
         this.birthDate = birthDate;
     }

     public Employee(String name, double salary)
      {
          this(name, salary, null);
      }

      public Employee(String name, Date birthDate)
       {
           this(name, 1000, birthDate);
       }


}
