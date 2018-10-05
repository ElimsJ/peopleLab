import java.util.Random;

public class Runner {
    static String[] firstName = {"Shuyi", "Kent", "Brian", "Wei", "Calvin", "Travis", "Vincent", "Jonathan", "Nathan", "Sheba", "Jack", "Dylan",};
    static String[] familyName = {"Gentleman", "Smith", "Li", "Lu", "Zheng", "Lin", "Rain", "Thunder", "Chair", "Table", "Matassa", "Leaf"};
    public static Student randomStudent(Student Student[])
    {
        int rnd = new Random().nextInt(Student.length);
        return Student[rnd];
    }
    public static void main(String [] args)
    {
        Teacher teach = new Teacher("JAVA", "Mr ", "Sushi", "River");
        Student[] student = new Student[12];
        for(int i = 0; i < 12; i++)
        {
            student[i] = randomStudent();
        }
        Classroom theClass = new Classroom(student,teach);
    }
}
