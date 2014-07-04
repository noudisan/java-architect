package com.manager.data;

import com.manager.data.model.StudentEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: noudisan
 * Date: 13-10-10
 * Time: 下午8:18
 * To change this template use File | Settings | File Templates.
 */
public interface StudentMapper {

    public StudentEntity getStudent(String studentID);

    public StudentEntity getStudentAndClass(String studentID);

    public List<StudentEntity> getStudentAll();

    public void insertStudent(StudentEntity entity);

    public void deleteStudent(StudentEntity entity);

    public void updateStudent(StudentEntity entity);
}