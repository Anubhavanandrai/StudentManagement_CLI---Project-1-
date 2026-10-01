package studentmanagement;

public class AdminInterfaceImpl extends CommonMethods implements AdminInterface {

    public AdminInterfaceImpl(StudentRepository studentRepository) {
        super(studentRepository);
    }

    @Override
    public void removeStudent() {

        System.out.println("Enter student roll number to remove:");

        int roll = sc.nextInt();

        Student student = repository.findById(roll);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        repository.remove(roll);

        System.out.println("Student removed successfully.");
    }

    @Override
    public void findStudent() {

        System.out.println("Enter student roll number:");

        int roll = sc.nextInt();

        Student student = repository.findById(roll);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("----- Student Details -----");
        System.out.println("Roll No: " + student.getRoll_no());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }

    @Override
    public void displayAllStudents() {

        if (repository.getAll().isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("----- All Students -----");

        for (Student student : repository.getAll()) {

            System.out.println(
                    "Roll No: " + student.getRoll_no()
                            + " | Name: " + student.getName()
                            + " | Age: " + student.getAge()
            );
        }
    }
}

