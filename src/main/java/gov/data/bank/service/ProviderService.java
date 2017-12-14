package gov.data.bank.service;

import gov.data.bank.bean.Provider;

import java.util.List;

/**
 * Created by imqsl on 2017-12-14.
 */
public interface ProviderService {

    //添加提供方
    void save(Provider provider);

    //删除提供方
    void remove(Integer id);

    //修改提供方
    void update(Provider provider);

    //根据id查询
    Provider selectById(Integer id);

    //查询所有提供方
    List<Provider> selectAll(Provider provider);
}
