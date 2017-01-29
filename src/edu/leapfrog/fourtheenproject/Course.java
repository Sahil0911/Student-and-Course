package edu.leapfrog.fourtheenproject;

public class Course {

    private String ContactNo, price, duration, durationtype, CourseName, StuName;
    int cId;

    public Course(int cId, String ContactNo, String price, String duration, String durationtype, String CourseName, String StuName) {
        this.cId = cId;
        this.ContactNo = ContactNo;
        this.price = price;
        this.duration = duration;
        this.durationtype = durationtype;
        this.CourseName = CourseName;
        this.StuName = StuName;
    }

    public Course() {
    }

    public int getCId() {
        return cId;
    }

    public void setCId(int cId) {
        this.cId = cId;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDurationtype() {
        return durationtype;
    }

    public void setDurationtype(String durationtype) {
        this.durationtype = durationtype;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    @Override
    public String toString() {
        return "Course{" + " CId=" + cId + ",Student's Name=" + StuName + "," + "ContactNo=" + ContactNo + ", Coursename=" + CourseName + ", price=" + price + ", duration=" + duration + ", durationtype=" + durationtype + '}';
    }

}
