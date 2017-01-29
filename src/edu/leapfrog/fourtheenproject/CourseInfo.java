package edu.leapfrog.fourtheenproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseInfo {

    private static List<Course> clist = new ArrayList<>();
    private CourseDAO cdao = new CourseDAOImpl();
    private Scanner cl = new Scanner(System.in);
    ProgramView pobj = new ProgramView();

    private static int s;

    public void getCInfo() {
        while (true) {
            System.out.println("1.Add");
            System.out.println("2.Search by id");
            System.out.println("3.Remove");
            System.out.println("4.Go back to Main menu");
            System.out.println("Enter your choice");
            s = cl.nextInt();
            switch (s) {
                case 1:
                    Course ce = new Course();
                    System.out.println("Enter Student's name:");
                    ce.setStuName(cl.next());
                    System.out.println("Enter Course id:");
                    ce.setCId(cl.nextInt());
                    System.out.println("Enter Course name:");
                    ce.setCourseName(cl.next());
                    System.out.println("Enter your Contact no.:");
                    ce.setContactNo(cl.next());
                    System.out.println("Enter duration of course:");
                    ce.setDuration(cl.next());
                    System.out.println("Enter duration type of course:");
                    ce.setDurationtype(cl.next());
                    System.out.println("Enter price for course:");
                    ce.setPrice(cl.next());
                    cdao.insert(ce);
                    break;
                case 2:
                    System.out.println("Enter Id to search!");
                    int x;
                    x = cl.nextInt();
                    if (cdao.getId(x) != null) {
                        System.out.println(cdao.getId(x).toString());
                    } else {
                        System.out.println(cdao.getId(x));
                    }
                    break;

                case 3:
                    int y;
                    System.out.println("Enter id of Course to be deleted");
                    y = cl.nextInt();
                    System.out.println(cdao.DeleteCourse(y));
                    break;
                case 4:
                    pobj.pView();
                default:
                    System.out.println("*******Enter correct choice*******");
                    getCInfo();
            }

        }

    }
}
