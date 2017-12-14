package gov.data.bank.service;
import gov.data.bank.bean.User;

import java.util.List;

/**
 * Created by imqsl on 2017-12-14.
 */
public interface UserService {

    //添加用户
    void save(User user);

    //删除用户
    void remove(Integer id);

    //修改用户
    void update(User user);

    //根据id查询
    User selectById(Integer id);

    //查询所有用户
    List<User> selectAll(User user);
}
