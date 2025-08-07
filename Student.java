public class Student {
    private int id;
    private String name;
    private int age;
    private String rollno;
    private String dept;
    private int marks;

    public Student() {}

    public Student(int id, String name, int age, String rollno, String dept, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.dept = dept;
        this.marks = marks;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getRollno() { return rollno; }
    public void setRollno(String rollno) { this.rollno = rollno; }

    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age +
                ", rollno=" + rollno + ", dept=" + dept + ", marks=" + marks + "]";
    }
}
