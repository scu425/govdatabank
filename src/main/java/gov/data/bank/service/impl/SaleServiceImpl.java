package gov.data.bank.service.impl;

import gov.data.bank.bean.Sale;
import gov.data.bank.dao.SaleDA0;
import gov.data.bank.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imqsl on 2017-12-12.
 */
@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    SaleDA0 saleDA0;
    @Override
    public void addSale(Sale sale) {
        saleDA0.insert(sale);
    }

    @Override
    public void deleteSale(Integer id) {
        saleDA0.delete(id);
    }

    @Override
    public void modifySale(Sale sale) {
        saleDA0.update(sale);
    }

    @Override
    public Sale findById(Integer id) {
        return saleDA0.selectById(id);
    }

    @Override
    public List<Sale> findDataSale(Sale sale) {
        return saleDA0.selectWithParams(sale);
    }
}
