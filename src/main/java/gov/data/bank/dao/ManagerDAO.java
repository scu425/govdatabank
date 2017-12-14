package gov.data.bank.dao;

import gov.data.bank.bean.Manager;
import gov.data.bank.dao.provider.ManagerDynaSqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static gov.data.bank.constant.GovDataBankConstant.MANAGER;

/**
 * Created by zhc on 2017/11/20
 */
public interface ManagerDAO {
    //添加管理员
    @Insert("insert into "+MANAGER+" (loginname,password) values (#{loginname},#{password})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    void insert(Manager manager);

    //根据id删除
    @Delete("delete from "+MANAGER+" where id=#{id}")
    void delete(Integer id);

    //动态更新
    @UpdateProvider(type = ManagerDynaSqlProvider.class,method = "updateWithParams")
    void update(Manager manager);

    //根据id查询
    @Select("select * from "+MANAGER+" where id=#{id}")
    Manager selectById(Integer id);

    //根据登录名查询
    @Select("select * from "+MANAGER+" where loginname=#{loginname}")
    Manager selectByLoginName(String loginname);

    //查询所有管理员
    @Select("select * from "+MANAGER+" ")
    List<Manager> selectAll();
}
