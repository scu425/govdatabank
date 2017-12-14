package gov.data.bank.dao;

import gov.data.bank.bean.Manager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-12-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ManagerDAOTest {
    @Autowired
    ManagerDAO managerDAO;
    @Test
    public void insert() throws Exception {
        managerDAO.insert(new Manager("abc","123"));
    }

    @Test
    public void delete() throws Exception {
        managerDAO.delete(7);
    }

    @Test
    public void update() throws Exception {
        Manager manager=new Manager();
        manager.setId(6);
        manager.setPassword("123654");
        managerDAO.update(manager);
    }

    @Test
    public void selectById() throws Exception {
        System.out.println(managerDAO.selectById(6).toString());
    }

    @Test
    public void selectByLoginName() throws Exception {
        System.out.println(managerDAO.selectByLoginName("root"));
    }

}