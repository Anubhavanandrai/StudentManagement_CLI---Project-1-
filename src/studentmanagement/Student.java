package studentmanagement;

public class Student {
    private int roll_no;
    private String name;
    private int age;
    private String course;

//If we do not write any constructor then java itself provides a no-args constructor, but here
//we have written a constructor so we have to write no-args as well.
    Student(){};
    Student(int roll_no, String name, int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;

    }

    public void setRoll_no(int roll)
    {
        this.roll_no=roll;
    }
    public int getRoll_no(){
        return roll_no;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age)
    {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setCourse(String course)
    {   System.out.println("Enter name");
        this.course=course;
    }
    public String getCourse(){
        return course;
    }


}
