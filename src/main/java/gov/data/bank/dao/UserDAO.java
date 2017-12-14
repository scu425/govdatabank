package gov.data.bank.dao;

import gov.data.bank.bean.User;
import gov.data.bank.dao.provider.UserDynaSqlProvider;
import org.apache.ibatis.annotations.*;
import java.util.List;
import static gov.data.bank.constant.GovDataBankConstant.USER;

/**
 * Created by qsl on 2017/11/20
 */
public interface UserDAO {

    @InsertProvider(type = UserDynaSqlProvider.class,method = "insertWithParams")
    void insert(User user);

    @Delete("delete from "+USER+" where id=#{id}")
    void delete(Integer id);

    @UpdateProvider(type = UserDynaSqlProvider.class,method = "updateWithParams")
    void update(User user);

    //根据id查询
    @Select("select * from "+USER+" where id=#{id}")
    User selectById(Integer id);

    //查询所有
    @Select("select * from "+USER)
    List<User> selectAll();

    @SelectProvider(type = UserDynaSqlProvider.class,method = "selectWithParams")
    List<User> selectWithParams(User user);

}
