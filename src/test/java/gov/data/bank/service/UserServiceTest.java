package gov.data.bank.service;

import gov.data.bank.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-12-14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class UserServiceTest {
    @Autowired
    UserService userService;
    @Test
    public void save() throws Exception {
        userService.save(new User("zzz","123456","2b",13203111562l,"21212@qq.com"));
    }

    @Test
    public void remove() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void selectById() throws Exception {
    }

    @Test
    public void selectAll() throws Exception {
    }

}