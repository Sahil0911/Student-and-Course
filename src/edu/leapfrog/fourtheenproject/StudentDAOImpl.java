package edu.leapfrog.fourtheenproject;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private static List<Student> slist = new ArrayList<>();

    @Override
    public void insert(Student st) {
        slist.add(st);
    }

    @Override
    public List<Student> getAll() {
        return slist;
    }

    @Override
    public Student getById(int si) {
        for (Student em : slist) {
            if (si == em.getId()) {
                return em;
            }
            else
                return null;

        }
        return null;
    }
    @Override
    public String DeleteId(int sid) {
        for (Student em : slist) {
            if (sid == em.getId()) {
                slist.remove(em);
                                return "Required data of Student is deleted";
            }

        }
        return null;
    }

}
