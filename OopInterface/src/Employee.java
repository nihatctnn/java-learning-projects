public abstract class Employee implements ISalary
{
    public String name;
    public double wage;

    public Employee(String name, double wage)
     {
         this.name = name;
         this.wage = wage;
     }
}