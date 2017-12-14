package gov.data.bank.dao;

import gov.data.bank.bean.Provider;
import gov.data.bank.dao.provider.ProviderDynaSqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static gov.data.bank.constant.GovDataBankConstant.PROVIDER;

/**
 * Created by zhc on 2017/11/20
 */
public interface ProviderDAO {

    @InsertProvider(type = ProviderDynaSqlProvider.class,method = "insertWithParams")
    void insert(Provider provider);

    @Delete("delete from "+ PROVIDER+" where id=#{id}")
    void delete(Integer id);

    @UpdateProvider(type = ProviderDynaSqlProvider.class,method = "updateWithParams")
    void update(Provider provider);

    //根据id查询
    @Select("select * from "+PROVIDER+" where id=#{id}")
    Provider selectById(Integer id);

    //查询所有
    @Select("select * from "+PROVIDER)
    List<Provider> selectAll();

    //动态查询
    @SelectProvider(type = ProviderDynaSqlProvider.class,method = "selectWithParams")
    List<Provider> selectWithParams(Provider provider);

}
