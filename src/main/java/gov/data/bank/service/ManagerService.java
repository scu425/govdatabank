package gov.data.bank.service;

import gov.data.bank.bean.Manager;

import java.util.List;

/**
 * Created by imqsl on 2017-12-14.
 */
public interface ManagerService {
    //添加管理员
    void save(Manager manager);

    //删除管理员
    void remove(Integer id);

    //修改管理员
    void update(Manager manager);

    //根据id查询
    Manager selectById(Integer id);

    //根据登录名查询
    Manager selectByLoginname(String loginname);

    //查询所有管理员
    List<Manager> selectAll(Manager manager);

}
