package gov.data.bank.dao;

import gov.data.bank.bean.Provider;
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
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ProviderDAOTest {
    @Autowired
    ProviderDAO providerDAO;
    @Test
    public void insert() throws Exception {
        providerDAO.insert(new Provider("贵阳教育局","education","123456"));
    }

    @Test
    public void delete() throws Exception {
        providerDAO.delete(3);
    }

    @Test
    public void update() throws Exception {
        Provider provider=new Provider();
        provider.setId(2);
        provider.setPassword("654321");
        providerDAO.update(provider);
    }

    @Test
    public void selectById() throws Exception {
        System.out.println(providerDAO.selectById(2));
    }

    @Test
    public void selectAll() throws Exception {

    }

    @Test
    public void selectWithParams() throws Exception {
        Provider provider=new Provider();
        provider.setLoginname("education");
        System.out.println(providerDAO.selectWithParams(provider));
    }

}