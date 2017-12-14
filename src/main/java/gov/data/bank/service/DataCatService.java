package gov.data.bank.service;


import gov.data.bank.bean.DataCat;

import java.util.List;

/**
 * Created by imqsl on 2017-12-11.
 */
public interface DataCatService {
    //添加分类
    void addCat(DataCat dataCat);
    //删除分类
    void deleteCat(Integer id);
    //修改分类
    void modifyCat(DataCat dataCat);
    //根据id查询分类
    DataCat findById(Integer id);
    //动态查询
    List<DataCat> findDataCat(DataCat dataCat);
}
