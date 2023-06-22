package com.studentdata.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentdata.stud.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

    
}
