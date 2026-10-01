package studentmanagement;

import java.util.Scanner;

public class Menu {

    private static final Scanner sc = new Scanner(System.in);

    public Menu(AdminInterfaceImpl ad) {

        while (true) {

            System.out.println("\n----- Admin Menu -----");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student");
            System.out.println("4. Find Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    ad.add();
                    break;

                case 2:

                    ad.removeStudent();
                    break;

                case 3:
                    ad.update();
                    break;

                case 4:
                    ad.findStudent();
                    break;

                case 5:
                    ad.displayAllStudents();
                    break;

                case 6:
                    System.out.println("Exiting Admin Menu...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public Menu(StudentInterfaceImpl st) {

        while (true) {

            System.out.println("\n----- Student Menu -----");
            System.out.println("1. Display Details");
            System.out.println("2. Add Yourself");
            System.out.println("3. Update Yourself");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    st.displayDetails();
                    break;

                case 2:
                    st.add();
                    break;

                case 3:
                    st.update();
                    break;

                case 4:
                    System.out.println("Exiting Student Menu...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}