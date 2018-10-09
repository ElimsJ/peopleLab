import java.util.Random;

public class Runner {
    static String[] firstName = {"Shuyi", "Kent", "Brian", "Wei", "Calvin", "Travis", "Vincent", "Jonathan", "Nathan", "Sheba", "Jack", "Dylan",};
    static String[] familyName = {"Gentleman", "Smith", "Li", "Lu", "Zheng", "Lin", "Rain", "Thunder", "Chair", "Table", "Matassa", "Leaf"};

    public static void main(String [] args)
    {
        Teacher teach = new Teacher("JAVA", "Mr ", "Nathan", "Levin");
        Student[] student = new Student[12];
        for(int i = 0; i < 12; i++)
        {
            student[i] = randomStudent();
        }
        Classroom theClass = new Classroom(student,teach);
        theClass.printClass();
    }

    public static Student randomStudent()
    {
        int rnd = new Random().nextInt(firstName.length);
        int rnd2 = new Random().nextInt(familyName.length);

        Student stu = new Student(firstName[rnd], familyName[rnd2]);

        return stu;
    }
}
