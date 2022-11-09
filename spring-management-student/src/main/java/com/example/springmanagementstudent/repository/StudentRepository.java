package com.example.springmanagementstudent.repository;

import com.example.springmanagementstudent.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
