package gov.data.bank.service;

import gov.data.bank.bean.DataCat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-12-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class DataCatServiceTest {
    @Autowired
    DataCatService dataCatService;

    @Test
    public void addCat() throws Exception {
        DataCat dataCat=new DataCat("经济建设","新微公租房租赁项目信息包括户数，已入住户数，面积等信息","新微公租房,租赁","城乡建设、环境保护","租赁和商务服务业","按季",new Date(),"市住建局","贵阳市观山湖区会展中心城SOHO商业区G座","公开数据");
        dataCatService.addCat(dataCat);
    }

    @Test
    public void deleteCat() throws Exception {
    }

    @Test
    public void modifyCat() throws Exception {
    }

    @Test
    public void findById() throws Exception {
    }

    @Test
    public void findDataCat() throws Exception {
    }

}