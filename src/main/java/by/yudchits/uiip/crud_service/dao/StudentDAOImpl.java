package by.yudchits.uiip.crud_service.dao;

import by.yudchits.uiip.crud_service.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    private SessionFactory factory;

    public List<Student> findAllStudents() {
        Session session = factory.getCurrentSession();

        return session.createQuery("from Student", Student.class).getResultList();
    }
}
