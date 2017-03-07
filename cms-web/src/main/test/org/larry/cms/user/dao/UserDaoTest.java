package org.larry.cms.user.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.larry.cms.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Larry on 2017/3/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/spring-*.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao userDao ;
    @Test
    public void queryByPage() throws Exception {
        System.out.println(userDao.queryByPage(new User(),10,0));
    }

    @Test
    public void queryById() throws Exception {
        long id = 2L ;
        User user = userDao.queryById(id) ;
        System.out.println(user);
    }

    @Test
    public void queryByCondition() throws Exception {

    }

    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setEmail("9335@qq.com");
        user.setLoginName("larry");
        user.setPassword("******");
        user.setMobile("124354332");
        user.setUserName("zhangsan");
        user.setStatus(1);
        user.setUserType(1);
        int result = userDao.addUser(user) ;
        System.out.println(result);
    }

    @Test
    public void updateUser() throws Exception {
        User user = new User();
        user.setId(2l);
        user.setEmail("larry@126.com");
        int result = userDao.updateUser(user) ;
        System.out.println(result);
    }

    @Test
    public void deleteUser() throws Exception {
        long id = 1l ;
        int result = userDao.deleteUser(id) ;
        System.out.println(result);
    }

}