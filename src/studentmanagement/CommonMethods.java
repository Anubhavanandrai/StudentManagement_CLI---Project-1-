package studentmanagement;

import java.util.Scanner;

public abstract class CommonMethods {

    protected final StudentRepository repository;

    public CommonMethods(StudentRepository repository) {
        this.repository = repository;
    }

   protected Scanner sc = new Scanner(System.in);
    public void add() {

        System.out.println("Enter your Roll:");
        int roll = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        Student student = new Student(roll,name,age);
        repository.add(student);

        System.out.println("Student created successfully.");
    }

    public void update() {

        System.out.println("Enter Student ID to update:");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = repository.findById(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("Enter new name:");
        String name = sc.nextLine();

        System.out.println("Enter new age:");
        int age = sc.nextInt();

        student.setName(name);
        student.setAge(age);


        System.out.println("Student updated successfully.");
    }

}
