package gov.data.bank.service;

import gov.data.bank.bean.Sale;

import java.util.List;

/**
 * Created by imqsl on 2017-12-12.
 */
public interface SaleService {
    //添加交易
    void addSale(Sale sale);
    //删除交易
    void deleteSale(Integer id);
    //修改交易
    void modifySale(Sale sale);
    //根据id查询交易
    Sale findById(Integer id);
    //动态查询
    List<Sale> findDataSale(Sale sale);
}
