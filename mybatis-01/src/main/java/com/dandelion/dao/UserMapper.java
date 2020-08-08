package com.dandelion.dao;

import com.dandelion.pojo.User;

public interface UserMapper {

    String getPasswordByName(String name);

    Boolean insertObj(User user);

}
