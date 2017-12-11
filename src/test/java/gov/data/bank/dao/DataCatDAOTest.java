package gov.data.bank.dao;

import com.sun.org.apache.bcel.internal.generic.DCMPG;
import gov.data.bank.bean.DataCat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-12-8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class DataCatDAOTest {
    @Autowired
    DataCatDAO dataCatDAO;
    @Test
    public void insert() throws Exception {
        DataCat dataCat=new DataCat("经济建设","新微公租房租赁项目信息包括户数，已入住户数，面积等信息","新微公租房,租赁","城乡建设、环境保护","租赁和商务服务业","按季",new Date(),"市住建局","贵阳市观山湖区会展中心城SOHO商业区G座","公开数据");
        dataCatDAO.insert(dataCat);
    }

    @Test
    public void delete() throws Exception {
        dataCatDAO.delete(2);
    }

    @Test
    public void update() throws Exception {
        DataCat dataCat=new DataCat();
        dataCat.setId(1);
        dataCat.setSecurityLevel("公开数据");
        dataCatDAO.update(dataCat);
    }

    @Test
    public void selectWithParams() throws Exception {
        List<DataCat> dataCatList=dataCatDAO.selectWithParams(new DataCat());
        for (DataCat d:dataCatList) {
            System.out.println(d.toString());
        }
    }

}