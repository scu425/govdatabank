package gov.data.bank.dao;

import com.sun.org.apache.bcel.internal.generic.DCMPG;
import gov.data.bank.bean.DataCat;
import gov.data.bank.dao.provider.DataCatDynaSqlProvider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import javax.xml.crypto.Data;
import java.util.List;

import static gov.data.bank.constant.GovDataBankConstant.DATACAT;

/**
 * Created by qsl on 2017/12/08
 */
public interface DataCatDAO {

    @InsertProvider(type = DataCatDynaSqlProvider.class,method = "insertWithParams")
    void insert(DataCat dataCat);

    @Delete("delete from "+DATACAT+" where id=#{id}")
    void delete(Integer id);

    @UpdateProvider(type = DataCatDynaSqlProvider.class,method = "updateWithParams")
    void update(DataCat dataCat);

    @SelectProvider(type = DataCatDynaSqlProvider.class,method = "selectWithParams")
    List<DataCat> selectWithParams(DataCat dataCat);

}
