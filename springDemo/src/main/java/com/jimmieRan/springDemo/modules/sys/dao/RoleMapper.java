package com.jimmieRan.springDemo.modules.sys.dao;

import java.util.List;

/**
 * Created by rj on 16-12-27.
 */
public interface RoleMapper {

    int addRole();

    int deleteRole();

    List findAllRoles();

    int update();

}
