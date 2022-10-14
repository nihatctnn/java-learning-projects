public class Officier extends Worker
{
    private String section;
    private String shift;

    public Officier(String nameSurname, String phoneNo, String eMail, String section, String shift)
     {
         super(nameSurname, phoneNo, eMail);
         this.section = section;
         this.shift = shift;
     }

    public String getSection()
     {
         return section;
     }

    public String getShift()
     {
         return shift;
     }

    public void setSection(String section)
     {
         this.section = section;
     }

    public void setShift(String shift)
     {
         this.shift = shift;
     }

    public void work()
     {
        System.out.println("Information : " + this.getNameSurname() + " worked.");
     }

}