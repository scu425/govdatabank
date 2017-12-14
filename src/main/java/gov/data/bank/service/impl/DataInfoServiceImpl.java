package gov.data.bank.service.impl;

import gov.data.bank.bean.DataInfo;
import gov.data.bank.dao.DataInfoDAO;
import gov.data.bank.service.DataInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imqsl on 2017-12-12.
 */
@Service
public class DataInfoServiceImpl implements DataInfoService{

    @Autowired
    DataInfoDAO dataInfoDAO;

    @Override
    public void addDataInfo(DataInfo dataInfo) {
        dataInfoDAO.insert(dataInfo);
    }

    @Override
    public void deleteDataInfo(Integer id) {
        dataInfoDAO.delete(id);
    }

    @Override
    public void modifyDataInfo(DataInfo dataInfo) {
        dataInfoDAO.update(dataInfo);
    }

    @Override
    public DataInfo findById(Integer id) {
        return dataInfoDAO.selectById(id);
    }

    @Override
    public List<DataInfo> findDataInfoByDataCatId(Integer datacatId) {
        return dataInfoDAO.selectByDataId(datacatId);
    }

    @Override
    public List<DataInfo> findDataInfo(DataInfo dataInfo) {
        return dataInfoDAO.selectWithParams(dataInfo);
    }

}
