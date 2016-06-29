package user.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.user.Dao.UserDao;
import user.user.models.Entity.User;
import user.user.service.UserService;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public void save(User userEntity) {
        userDao.save(userEntity);
    }

    @Override
    public void delete(User userEntity) {
        userDao.delete(userEntity);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void update(User userEntity) {
        userDao.update(userEntity);
    }

    @Override
    public User getUser(int userId) {
        return userDao.getUser(userId);
    }
}
