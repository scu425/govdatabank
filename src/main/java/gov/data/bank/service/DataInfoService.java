package gov.data.bank.service;

import gov.data.bank.bean.DataInfo;

import java.util.List;

/**
 * Created by imqsl on 2017-12-11.
 */
public interface DataInfoService {
    //添加信息
    void addDataInfo(DataInfo dataInfo);
    //删除信息
    void deleteDataInfo(Integer id);
    //修改信息
    void modifyDataInfo(DataInfo dataInfo);
    //根据id查询信息
    DataInfo findById(Integer id);
    //根据datacatId查询信息
    List<DataInfo> findDataInfoByDataCatId(Integer datacatId);

    //动态查询
    List<DataInfo> findDataInfo(DataInfo dataInfo);
}
