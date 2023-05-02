package com.example.springex.Entities;

public class Department {
    private int dept_id;
    private String dname;
    private String location;
    public Department() {

    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_id=" + dept_id +
                ", dname='" + dname + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
