package com.studentdata.stud.service;


import java.util.List;

import com.studentdata.stud.model.Student;

public interface StudentService {
    public Student savesStudent(Student student);

    public List<Student> getAllStudents();
}
