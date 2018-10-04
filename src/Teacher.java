public class Teacher extends Person{
    String subject = "";
    String title = "";
    public Teacher(String subject,String title, String firstName, String familyName)
    {
        super(firstName,familyName);
        this.subject = subject;
        this.title = title;
    }
    public  String getSubject(String subject)
    {
        return subject;
    }
    public  String getTitle(String titleName)
    {
        return titleName;
    }

}
//RykoZin#0001