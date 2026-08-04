class Student{
    String name;
    int grade;

    Student(String name, int grade){
        System.out.println("Student is listed!");
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    
}
public class Basic {
    public static void main(String[] args) {
        Student s1 = new Student("Austin", 100);
        System.out.println(s1.getName());
        System.out.println(s1.getGrade());
    }
}
