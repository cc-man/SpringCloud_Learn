package com.nosql.mongodb.mongodbserver.service;

import com.nosql.mongodb.mongodbserver.model.Users;

import java.util.List;

/**
 * mongodb 案例
 *
 */
public interface IUserService {
    public void saveUser(Users users);

    public Users findUserByName(String name);

    public void removeUser(String name);

    public void updateUser(String name, String key, String value);

    public List<Users> listUser();
}
