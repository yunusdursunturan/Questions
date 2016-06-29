package user.user.Dao;

import user.user.models.Entity.User;

import java.util.List;


public interface UserDao {
    public void save(User user) ;

    public void delete(User user);

    public List<User> getAll() ;

    public void update(User user) ;

    public User getUser(int userId);
}
