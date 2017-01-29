package edu.leapfrog.fourtheenproject;

import java.util.ArrayList;
import java.util.List;

public class CourseDAOImpl implements CourseDAO {

    private static List<Course> clist = new ArrayList<>();

    @Override
    public void insert(Course c) {
        clist.add(c);
    }

    @Override
    public List<Course> getAll() {
        return clist;
    }

    @Override
    public Course getId(int cid) {
        for (Course em : clist) {
            if (cid == em.getCId()) {
                return em;
            }

        }
        return null;
    }

    @Override
    public String DeleteCourse(int ci) {
        for (Course m : clist) {
            if (ci == m.getCId()) {
                clist.remove(m);
                return "Mentioned Course of id  is deleted.";
            }

        }
        return null;
    }
}
