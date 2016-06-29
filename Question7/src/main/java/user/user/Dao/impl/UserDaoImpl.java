package user.user.Dao.impl;


import java.util.List;

import javax.transaction.Transactional;

import user.user.Dao.UserDao;
import user.user.models.Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory _sessionFactory;

    private Session getSession() {
        return _sessionFactory.getCurrentSession();
    }

    @Override
    public void save(User user) {
        getSession().save(user);
        return;
    }

    @Override
    public void delete(User user) {
        getSession().delete(user);
        return;
    }

    @Override
    public List<User> getAll() {
        return getSession().createQuery("from Users").list();
    }

    @Override
    public void update(User user) {
        getSession().update(user);
        return;
    }

    @Override
    public User getUser(int userId) {
        return (User) getSession().load(User.class, new Integer(userId));
    }
}
