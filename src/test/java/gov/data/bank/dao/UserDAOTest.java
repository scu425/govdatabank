package gov.data.bank.dao;

import gov.data.bank.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-12-14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDAOTest {
    @Autowired
    UserDAO userDAO;
    @Test
    public void insert() throws Exception {
        userDAO.insert(new User("aaa","123","05241",13523214564l,"dsfsd@163.com"));
    }


    @Test
    public void delete() throws Exception {
        userDAO.delete(2);
    }

    @Test
    public void update() throws Exception {
        User user=new User();
        user.setId(1);
        user.setEmail("zhnnewbility@163.com");
        userDAO.update(user);
    }

    @Test
    public void selectById() throws Exception {
        System.out.println(userDAO.selectById(1).toString());
    }

    @Test
    public void selectAll() throws Exception {
        List<User> userList=userDAO.selectAll();
        for (User u:userList) {
            System.out.println(u.toString());
        }
    }

    @Test
    public void selectWithParams() throws Exception {
        User user=new User();
        user.setNickname("piggy");
        System.out.println(userDAO.selectWithParams(user));
    }

}