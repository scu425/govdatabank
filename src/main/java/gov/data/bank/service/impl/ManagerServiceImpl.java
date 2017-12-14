package gov.data.bank.service.impl;

import gov.data.bank.bean.Manager;
import gov.data.bank.dao.ManagerDAO;
import gov.data.bank.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imqsl on 2017-12-14.
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    ManagerDAO managerDAO;
    @Override
    public void save(Manager manager) {
        managerDAO.insert(manager);
    }

    @Override
    public void remove(Integer id) {
        managerDAO.delete(id);
    }

    @Override
    public void update(Manager manager) {
        managerDAO.update(manager);
    }

    @Override
    public Manager selectById(Integer id) {
        return managerDAO.selectById(id);
    }

    @Override
    public List<Manager> selectAll(Manager manager) {
        return managerDAO.selectAll();
    }

    @Override
    public Manager selectByLoginname(String loginname) {
        return managerDAO.selectByLoginName(loginname);
    }
}
