package by.yudchits.uiip.crud_service.service;

import by.yudchits.uiip.crud_service.dao.StudentDAO;
import by.yudchits.uiip.crud_service.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO dao;

    @Override
    @Transactional
    public Student findById(long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }

    @Override
    @Transactional
    public void saveOrUpdateStudent(Student student) {
        dao.saveOrUpdateStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent(Student student) {
        dao.deleteStudent(student);
    }
}
