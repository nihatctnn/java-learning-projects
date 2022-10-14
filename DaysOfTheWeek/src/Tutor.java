enum DaysOfTheWeek
{
    MONDAY(1,"Nihat", "Çetin"),
    TUESDAY(2,"Muhammed","Çubukcu"),
    WEDNESDAY(3,"Nesrullah", "Gökçek"),
    THURSDAY(4,"Ali", "Gökçek"),
    FRIDAY(5,"Murat", "Atar"),
    SATURDAY(6,"Egemen", "Miraç"),
    SUNDAY(7,"Furkan", "Gedik");

    private int id;
    private String name;
    private String surname;

    DaysOfTheWeek( int id, String name, String surname)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }
    public int getId()
     {
         return id;
     }


    public String toString()
    {
        return this.name + " " + this.surname;
    }
}

public class Tutor
{
}