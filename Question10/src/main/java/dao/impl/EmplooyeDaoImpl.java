package dao.impl;

import dao.EmployeeDao;
import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by yunus on 03.07.2016.
 */
public class EmplooyeDaoImpl implements EmployeeDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Employee employee) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(employee);
        tx.commit();
        session.close();
    }
}
