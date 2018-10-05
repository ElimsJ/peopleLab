public class Student extends Person {
    private double GPA;
    private String familyName;
    private String firstName;

    public Student(String firstName, String familyName, double GPA) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.familyName = familyName;
        this.firstName = firstName;
    }

    public double getGPA() {
        return GPA;
    }

    public String toString() {
        return familyName + " , " + firstName;
    }
}