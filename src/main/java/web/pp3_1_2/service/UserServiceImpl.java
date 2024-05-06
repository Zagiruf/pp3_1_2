package web.pp3_1_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.pp3_1_2.dao.UserDAO;
import web.pp3_1_2.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> gelAllUsers() {
        return userDAO.gelAllUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public User show(int id) {
        return userDAO.show(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User updatedUser) {
        userDAO.updateUser(updatedUser);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
