public class Student extends Person {
    private double GPA;
    private String familyName;
    private String firstName;

    public Student(String firstName, String familyName) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.familyName = familyName;
        this.firstName = firstName;
    }

    public double getGPA() {
        double x = Math.ceil(4);
        GPA = x;
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String getFamilyName() {
        return familyName;
    }

    @Override
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String toString() {
        return familyName + " , " + firstName;
    }
}