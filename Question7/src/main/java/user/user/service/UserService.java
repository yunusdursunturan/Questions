package user.user.service;

import user.user.models.Entity.User;

import java.util.List;


public interface UserService {
    public void save(User userEntity) ;

    public void delete(User userEntity);

    public List<User> getAll() ;

    public void update(User userEntity) ;

    public User getUser(int userId);
}
