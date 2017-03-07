package org.larry.cms.user.dao;

import org.apache.ibatis.annotations.Param;
import org.larry.cms.user.entity.User;

import java.util.List;

/**
 * Created by Larry on 2017/3/6.
 */
public interface UserDao {

    List<User> queryByPage(@Param("user") User user, @Param("pageSize") int pageSize,@Param("offset") int offset);

    User queryById(Long id) ;

    List<User> queryByCondition(User user) ;

    int addUser(User user) ;

    int updateUser(User user) ;

    int deleteUser(Long id) ;
}
