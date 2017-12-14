package gov.data.bank.service;

import gov.data.bank.bean.DataInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-12-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class DataInfoServiceTest {
    @Autowired
    DataInfoService dataInfoService;
    @Test
    public void addDataInfo() throws Exception {
        DataInfo dataInfo=new DataInfo("贵阳高中分布",new Date(),1.22,1,"education");
        dataInfoService.addDataInfo(dataInfo);
    }

    @Test
    public void deleteDataInfo() throws Exception {
    }

    @Test
    public void modifyDataInfo() throws Exception {
    }

    @Test
    public void findById() throws Exception {
    }

    @Test
    public void findDataInfoByDataCatId() throws Exception {
    }

    @Test
    public void findDataInfo() throws Exception {
    }

}