package dao.impl;

import dao.DepartmentDao;
import entity.Department;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by yunus on 03.07.2016.
 */
public class DepartmentDaoImpl implements DepartmentDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Department department) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(department);
        tx.commit();
        session.close();
    }
}
