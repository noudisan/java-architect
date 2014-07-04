package com.manager.data.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: noudisan
 * Date: 13-10-10
 * Time: 下午8:16
 * To change this template use File | Settings | File Templates.
 */
public class StudentEntity implements Serializable {
    private static final long serialVersionUID = 3096154202413606831L;
    private Date studentBirthday;
    private String studentID;
    private String studentName;
    private String studentSex;
    private  String classId;

    public Date getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(Date studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}
