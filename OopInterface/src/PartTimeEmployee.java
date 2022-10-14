public class PartTimeEmployee extends Employee
{

    public double hours;
    public double hourlyWage;

    public PartTimeEmployee(String name, double hours, double hourlyWage)
     {
         super(name, 0.0);
         this.hours = hours;
         this.hourlyWage = hourlyWage;
     }

    @Override
    public double calculateSalary()
     {
         return  this.hourlyWage * this.hours;
     }

}