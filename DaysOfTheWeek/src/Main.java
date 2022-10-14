public class Main
{
    public static void main(String[] args)
    {
        for(DaysOfTheWeek day: DaysOfTheWeek.values())
         {
             System.out.println(day.getId() +"-"+ day.getName() + " " + day.getSurname() +" ---> " + day.name());
         }

    }
}
