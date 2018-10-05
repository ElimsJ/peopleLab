public class Runner {
    static String[] firstName = {"Shuyi", "Kent", "Brian", "Wei", "Calvin", "Travis", "Vincent", "Jonathan", "Nathan", "Sheba", "Jack", "Dylan",};
    static String[] familyName = {"Gentleman", "Smith", "Li", "Lu", "Zheng", "Lin", "Rain", "Thunder", "Chair", "Table", "Matassa", "Leaf"};
    public static void main(String [] args)
    {
        Teacher teacher = new Teacher("JAVA", "Mr.", "Sushi", "River");
        Student student = new Student("Brian", "Lu");
        System.out.println(teacher);
        System.out.println(student);
    }
}
