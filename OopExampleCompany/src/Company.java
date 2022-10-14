enum CompanyName
{
    APPLE,
    MICROSOFT,
    IBM
}

public class Company
{
    private Employee[] emps;
    private CompanyName companyName;

    public Company(CompanyName companyName, Employee[] emps)
    {
        this.companyName = companyName;
        this.emps = emps;
    }

    public Employee[] getEmps() {
        return emps;
    }

    public void setEmps(Employee[] emps) {
        this.emps = emps;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }
}