package com.xiehn;

public class Student {
    private int sid;
    private String sname;
    private String sex;
    private String clazz;

    public Student() {
    }

    public Student(int sid, String sname, String sex, String clazz) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "com.xiehn.Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
