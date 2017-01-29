package edu.leapfrog.fourtheenproject;

public class Student {

    private String Fn, ln, email;
    int SId;

    public Student(int SId, String Fn, String ln, String email) {
        this.SId = SId;
        this.Fn = Fn;
        this.ln = ln;
        this.email = email;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + " SId=" + SId + ", Fn=" + Fn + ", ln=" + ln + ", email=" + email + '}';
    }

    public int getId() {
        return SId;
    }

    public void setSId(int SId) {
        this.SId = SId;
    }

    public String getFn() {
        return Fn;
    }

    public void setFn(String Fn) {
        this.Fn = Fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
