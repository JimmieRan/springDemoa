package com.jimmieRan.springDemo.modules.sys.dao;

import java.util.List;

/**
 * Created by rj on 16-12-26.
 */
public interface UserDao {

    int deleteUser();

    int addUser();

    List selectAllUser();
}
