package by.yudchits.uiip.crud_service.dao;

import by.yudchits.uiip.crud_service.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private SessionFactory factory;

    @Override
    public Student findById(long id) {
        Session session = factory.getCurrentSession();

        return session.get(Student.class, id);
    }

    @Override
    public List<Student> findAllStudents() {
        Session session = factory.getCurrentSession();

        return session.createQuery("from Student", Student.class).getResultList();
    }

    @Override
    public void saveOrUpdateStudent(Student student) {
        Session session = factory.getCurrentSession();

        session.saveOrUpdate(student);
    }

    @Override
    public void deleteStudent(Student student) {
        Session session = factory.getCurrentSession();

        session.delete(student);
    }
}
