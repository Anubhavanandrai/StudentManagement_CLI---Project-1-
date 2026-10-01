package studentmanagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private final List<Student> students = new ArrayList<>();
    private static final String fileName = "studentsData.txt";

    private final File fileObject = new File(fileName);

    public StudentRepository() {
    //This i have made because when we create object of this file will also be initialise by itself
        System.out.println("File location: " + fileObject.getAbsolutePath());
        loadFromFile();
    }

    public void add(Student student) {
        students.add(student);
        saveToFile();
    }

    public void updateFile() {
        saveToFile();
    }

    public List<Student> getAll() {
        return students;
    }

    public Student findById(int roll) {
        for (Student student : students) {
            if (student.getRoll_no() == roll) {
                return student;
            }
        }
        return null;
    }

    public void remove(int roll) {
        students.removeIf(student -> student.getRoll_no() == roll);
        saveToFile();
    }

    private void saveToFile() {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileObject))) {

            for (Student student : students) {
            writer.write(student.getRoll_no() + "," + student.getName() + "," + student.getAge());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error while saving student data: " + e.getMessage());
        }
    }

    private void loadFromFile() {

        if (!fileObject.exists()) {
            System.out.println("Student file does not exist yet.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileObject))) {
            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");
                int roll = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);

                Student student = new Student(roll, name, age);
                students.add(student);
            }

        } catch (IOException e) {
            System.out.println("Error while reading student data: " + e.getMessage());
        }
    }
}