package gov.data.bank.dao;

import gov.data.bank.bean.Sale;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-12-8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SaleDA0Test {
    @Autowired
    SaleDA0 saleDA0;
    @Test
    public void insert() throws Exception {
        saleDA0.insert(new Sale(1,2,2.55));
    }

    @Test
    public void delete() throws Exception {
        saleDA0.delete(2);
    }

    @Test
    public void update() throws Exception {
        Sale sale=new Sale();
        sale.setId(1);
        sale.setTotal(3.66);
        saleDA0.update(sale);
    }

    @Test
    public void selectWithParams() throws Exception {
        List<Sale> saleList=saleDA0.selectWithParams(new Sale());
        for (Sale s:saleList) {
            System.out.println(s.toString());
        }
    }

}