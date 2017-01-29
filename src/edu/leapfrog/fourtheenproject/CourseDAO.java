package edu.leapfrog.fourtheenproject;

import java.util.List;

public interface CourseDAO {

    void insert(Course c);

    List<Course> getAll();

    Course getId(int cid);

    
    String DeleteCourse(int ci);
}
