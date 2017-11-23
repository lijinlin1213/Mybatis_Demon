package com.sogo.dao;

import com.sogo.model.User;

import java.util.List;

/**
 * Created by lijinlin on 2017/11/23.
 */
public interface UserDao {
    public List<User> getUserList();

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUser(int userId);

    public User getUser(int id);
}
