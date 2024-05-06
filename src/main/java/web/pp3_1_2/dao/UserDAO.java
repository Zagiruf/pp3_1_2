package web.pp3_1_2.dao;

import web.pp3_1_2.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> gelAllUsers();

    public User show(int id);

    public void saveUser(User user);

    public void updateUser(User updatedUser);

    public void deleteUser(int id);
}
