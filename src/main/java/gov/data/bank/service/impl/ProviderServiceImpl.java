package gov.data.bank.service.impl;

import gov.data.bank.bean.Provider;
import gov.data.bank.dao.ProviderDAO;
import gov.data.bank.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imqsl on 2017-12-14.
 */
@Service
public class ProviderServiceImpl implements ProviderService{
    @Autowired
    ProviderDAO providerDAO;
    @Override
    public void save(Provider provider) {
        providerDAO.insert(provider);
    }

    @Override
    public void remove(Integer id) {
        providerDAO.delete(id);
    }

    @Override
    public void update(Provider provider) {
        providerDAO.update(provider);
    }

    @Override
    public Provider selectById(Integer id) {
        return providerDAO.selectById(id);
    }

    @Override
    public List<Provider> selectAll(Provider provider) {
        return providerDAO.selectAll();
    }
}
