package dao.impl;

import dao.MeetingsDao;
import entity.Meetings;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 * Created by yunus on 03.07.2016.
 */
public class MeetingsDaoImpl implements MeetingsDao{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Meetings meetings) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(meetings);
        tx.commit();
        session.close();
    }
}
