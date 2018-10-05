public class Classroom {

    Student[] student;
    Teacher teacher;

    public Classroom(Student [] student, Teacher teacher)
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

    }

    public String printClass()
    {

    }
}
