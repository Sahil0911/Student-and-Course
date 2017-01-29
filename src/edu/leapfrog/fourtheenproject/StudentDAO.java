package edu.leapfrog.fourtheenproject;

import java.util.List;

public interface StudentDAO {

    void insert(Student st);

    List<Student> getAll();

    Student getById(int sid);

    String DeleteId(int sid);
}
