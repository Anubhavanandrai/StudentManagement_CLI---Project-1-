package studentmanagement;



public class StudentInterfaceImpl extends CommonMethods implements StudentInterface{

  public StudentInterfaceImpl(StudentRepository studentRepository)
  {
      super(studentRepository);
  }


    @Override
    public void displayDetails()
    {
        System.out.println("Enter student roll number to find:");
        int roll = sc.nextInt();
        Student student = repository.findById(roll);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        Student st=repository.findById(roll);
        System.out.println("Student Name is : "+st.getName()+"\n"+ "Student Age is: "+st.getAge()+"\n"+ " Student Roll No is : "+st.getRoll_no());
    }

}
