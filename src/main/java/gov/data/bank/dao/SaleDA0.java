package gov.data.bank.dao;

import gov.data.bank.bean.DataCat;
import gov.data.bank.bean.Sale;
import gov.data.bank.dao.provider.DataCatDynaSqlProvider;
import gov.data.bank.dao.provider.SaleDynaSqlProvider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

import static gov.data.bank.constant.GovDataBankConstant.SALE;

/**
 * Created by zhc on 2017/11/20
 */
public interface SaleDA0 {

    @InsertProvider(type = SaleDynaSqlProvider.class,method = "insertWithParams")
    void insert(Sale sale);

    @Delete("delete from "+SALE+" where id=#{id}")
    void delete(Integer id);

    @UpdateProvider(type = SaleDynaSqlProvider.class,method = "updateWithParams")
    void update(Sale sale);

    @SelectProvider(type = SaleDynaSqlProvider.class,method = "selectWithParams")
    List<Sale> selectWithParams(Sale sale);
}
