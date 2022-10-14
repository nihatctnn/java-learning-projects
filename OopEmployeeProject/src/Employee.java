public abstract class Employee
{
    public String lastName;
    public int socSecNum;        // Social Security Number

    public Employee(String lastName, int socSecNum)
     {
         this.lastName = lastName;
         this.socSecNum = socSecNum;
     }

    public abstract double earning();

    public String toString()
     {
         return this.getClass().getSimpleName() + "\n Surname : " + this.lastName + "\n Social Security Number : " + this.socSecNum + "\n Earning : " + this.earning();
     }

}