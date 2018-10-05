public class Teacher extends Person{
    String subject = "";
    String title = "";
    String familyName = "";
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher(String subject, String title, String firstName, String familyName)
    {
        super(firstName,familyName);
        this.subject = subject;
        this.title = title;
        this.familyName = familyName;
    }
    public  String getSubject(String subject)
    {
        return subject;
    }
    public  String getTitle(String title)
    {
        return title;
    }
    public String toString() {
        return subject + " , " + title + "." + familyName ;
    }
}
//RykoZin#0001