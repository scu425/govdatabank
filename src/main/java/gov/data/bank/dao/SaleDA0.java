package gov.data.bank.dao;

import gov.data.bank.bean.Sale;
import gov.data.bank.dao.provider.SaleDynaSqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static gov.data.bank.constant.GovDataBankConstant.SALE;

/**
 * Created by qsl on 2017/11/20
 */
public interface SaleDA0 {

    @InsertProvider(type = SaleDynaSqlProvider.class,method = "insertWithParams")
    void insert(Sale sale);

    @Delete("delete from "+SALE+" where id=#{id}")
    void delete(Integer id);

    @UpdateProvider(type = SaleDynaSqlProvider.class,method = "updateWithParams")
    void update(Sale sale);

    //根据id查询
    @Select("select * from "+SALE+" where id=#{id}")
    Sale selectById(Integer id);

    @SelectProvider(type = SaleDynaSqlProvider.class,method = "selectWithParams")
    List<Sale> selectWithParams(Sale sale);
}
