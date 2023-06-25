package com.studentdata.stud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdata.stud.model.Student;
import com.studentdata.stud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student savesStudent(Student student) {
        return studentRepository.save(student);
    }
    // @Override
    // public List<Student> getAllStudents() {
    //     return studentRepository.findAll();
    // }

    
}
