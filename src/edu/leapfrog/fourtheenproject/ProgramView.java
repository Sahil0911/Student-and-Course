package edu.leapfrog.fourtheenproject;

//import static edu.leapfrog.fourtheenproject.Activities.si;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramView {

    static StudentInfo si = new StudentInfo();
    static CourseInfo ci = new CourseInfo();
    private static List<Course> Clist = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static int choice;

    public void pView() {
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1.Student");
            System.out.println("2.Course");
            System.out.println("************");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    si.getSInfo();
                    break;

                case 2:
                    ci.getCInfo();
                    break;
                default:
                    System.out.println("*******Enter correct choice*******");
                    pView();

            }

        }

    }
}
