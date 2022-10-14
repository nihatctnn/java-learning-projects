public class Employee
{
    private int id;
    private String name;

    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public String toString()
    {
        return this.id + "\t--->\t" +this.name ;
    }

}