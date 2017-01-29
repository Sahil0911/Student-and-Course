package edu.leapfrog.fourtheenproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentInfo {

    private Scanner sch = new Scanner(System.in);
    private ProgramView pV = new ProgramView();
    private StudentDAO sdao = new StudentDAOImpl();
    private static int stuChoice;

    public void getSInfo() {
        while (true) {
            System.out.println("1.Add");
            System.out.println("2.Search by id");
            System.out.println("3.Remove");
            System.out.println("4.Go back to Main menu");
            System.out.println("Enter your choice");
            stuChoice = sch.nextInt();
            switch (stuChoice) {
                case 1:
                    Student St = new Student();
                    System.out.println("Enter ID:");
                    St.setSId(sch.nextInt());
                    System.out.println("Enter first name:");
                    St.setFn(sch.next());
                    System.out.println("Enter last name:");
                    St.setLn(sch.next());
                    System.out.println("Enter email:");
                    St.setEmail(sch.next());
                    sdao.insert(St);
                    break;
                case 2:
                    System.out.println("Enter Id to search!");
                    int x;
                    x = sch.nextInt();
                    if (sdao.getById(x) != null) {
                        System.out.println(sdao.getById(x).toString());
                    } else {
                        System.out.println(sdao.getById(x));
                    }
                    break;
                case 3:
                    System.out.println("Enter id of Student to be deleted");
                    int y;
                    y = sch.nextInt();
                    System.out.println(sdao.DeleteId(y));
                    break;
                case 4:
                    pV.pView();
                default:
                    System.out.println("*******Enter correct choice*******");
                    getSInfo();

            }

        }
    }
}
