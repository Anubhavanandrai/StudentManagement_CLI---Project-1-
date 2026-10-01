package studentmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Type your number accordingly: "+"1 User"+" 2 Admin "+"\n");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        StudentRepository studentRepository=new StudentRepository();
        switch (x)
        {
            case 1:
                StudentInterfaceImpl st=new StudentInterfaceImpl(studentRepository);
                 Menu studentMenu=new Menu(st);
                 break;
            case 2:
                AdminInterfaceImpl ad=new AdminInterfaceImpl(studentRepository);
                 Menu adminMenu=new Menu(ad);
                 break;
            default:
                System.out.println("Invalid choice");
            }
        }

    }




