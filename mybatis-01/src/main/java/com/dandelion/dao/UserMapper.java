package com.dandelion.dao;

import com.dandelion.pojo.User;

public interface UserMapper {

    String getPasswordByName(String name);

    Boolean insertObj(User user);

    User getUserByName(String name);

    Boolean insert_friend(String friend_id1, String friend_id2);

}
