package gov.data.bank.service.impl;

import gov.data.bank.bean.User;
import gov.data.bank.dao.UserDAO;
import gov.data.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imqsl on 2017-12-14.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;
    @Override
    public void save(User user) {
        userDAO.insert(user);
    }

    @Override
    public void remove(Integer id) {
        userDAO.delete(id);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public User selectById(Integer id) {
        return userDAO.selectById(id);
    }

    @Override
    public List<User> selectAll(User user) {
        return userDAO.selectAll();
    }
}
