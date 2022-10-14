public class Security extends Officier
{
    private String document;

    public Security(String nameSurname, String phoneNo, String eMail, String section, String shift, String document)
     {
         super(nameSurname, phoneNo, eMail, section, shift);
         this.document = document;
     }

    public String getDocument()
     {
        return document;
     }

    public void setDocument(String document)
     {
        this.document = document;
     }

    public void watch()
     {
         System.out.println("Information : Security guards watch the campus through security cameras.");
     }
}