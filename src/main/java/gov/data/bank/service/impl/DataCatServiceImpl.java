package gov.data.bank.service.impl;

import gov.data.bank.bean.DataCat;
import gov.data.bank.dao.DataCatDAO;
import gov.data.bank.service.DataCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imqsl on 2017-12-12.
 */
@Service
public class DataCatServiceImpl implements DataCatService {
    @Autowired
    DataCatDAO dataCatDAO;

    @Override
    public void addCat(DataCat dataCat) {
        dataCatDAO.insert(dataCat);

    }

    @Override
    public void deleteCat(Integer id) {
        dataCatDAO.delete(id);
    }

    @Override
    public void modifyCat(DataCat dataCat) {
        dataCatDAO.update(dataCat);
    }

    @Override
    public DataCat findById(Integer id) {
        return dataCatDAO.selectById(id);
    }

    @Override
    public List<DataCat> findDataCat(DataCat dataCat) {
        return dataCatDAO.selectWithParams(dataCat);
    }
}
