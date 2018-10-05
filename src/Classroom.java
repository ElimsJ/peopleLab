public class Classroom{

    Student[] student;
    Teacher teacher;

    public Classroom(Student[] student, Teacher teacher)
    {
        this.student = student;
        this.teacher = teacher;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getSubject()
    {
        return this.teacher.getSubject();
    }

    public double classAverage()
    {
        double sum = 0;
        double gpanum = 0;
        for(int i = 0; i < student.length -1; i++)
        {
            gpanum = student[i].getGPA();
            sum += gpanum;
        }
        return (sum/(student.length -1));
    }

    public void printClass()
    {
        System.out.println(teacher);
        System.out.println(teacher.getSubject());
        for(Student s : student)
        {
            System.out.println(s);
        }
    }
}
