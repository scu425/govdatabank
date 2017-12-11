package gov.data.bank.dao;

import gov.data.bank.bean.DataInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.Date;
import java.util.List;


/**
 * Created by imqsl on 2017-12-8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class DataInfoDAOTest {
    @Autowired
    DataInfoDAO dataInfoDAO;
    @Test
    public void insert() throws Exception {
        DataInfo dataInfo=new DataInfo("贵阳高中分布",new Date(),1.22,1,"education");
        dataInfoDAO.insert(dataInfo);
    }

    @Test
    public void delete() throws Exception {
        dataInfoDAO.delete(2);
    }

    @Test
    public void update() throws Exception {
        DataInfo dataInfo=new DataInfo();
        dataInfo.setId(1);
        dataInfo.setPrice(0.33);
        dataInfoDAO.update(dataInfo);
    }

    @Test
    public void selectWithParams() throws Exception {
        DataInfo dataInfo=new DataInfo();
        List<DataInfo> dataInfoList=dataInfoDAO.selectWithParams(dataInfo);
        for (DataInfo d:dataInfoList) {
            System.out.println(d.toString());
        }
    }

}