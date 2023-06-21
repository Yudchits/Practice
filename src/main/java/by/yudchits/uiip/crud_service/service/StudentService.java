package by.yudchits.uiip.crud_service.service;


import by.yudchits.uiip.crud_service.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
    void saveOrUpdateStudent(Student student);
    Student findById(long id);
    void deleteStudent(Student student);
}
