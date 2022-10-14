public class InformationProcessingCenter extends Officier
{
    private String duty;

    public InformationProcessingCenter(String nameSurname, String phoneNo, String eMail, String section, String shift, String duty)
     {
         super(nameSurname, phoneNo, eMail, section, shift);
         this.duty = duty;
     }

    public String getDuty()
     {
        return duty;
     }

    public void setDuty(String duty)
     {
        this.duty = duty;
     }

    public void networkSetup()
     {
         System.out.println("Information : Network bug fixed.");
     }
}