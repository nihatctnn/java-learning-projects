public class SalariedEmployee extends Employee
{
    public double weeklySalary;

    public SalariedEmployee(String lastName, int socSecNum, double weeklySalary)
     {
         super(lastName, socSecNum);
         this.weeklySalary = weeklySalary;
     }

    @Override
    public double earning()
    {
        return weeklySalary;
    }

}