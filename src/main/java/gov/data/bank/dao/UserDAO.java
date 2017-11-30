package gov.data.bank.dao;

import org.apache.ibatis.annotations.Select;

/**
 * Created by zhc on 2017/11/20
 */
public interface UserDAO {

    @Select("selecy")
    void selectUserById(int id);
}
