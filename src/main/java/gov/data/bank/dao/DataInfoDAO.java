package gov.data.bank.dao;

import gov.data.bank.bean.DataInfo;
import gov.data.bank.dao.provider.DataInfoDynaSqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static gov.data.bank.constant.GovDataBankConstant.DATAINFO;

/**
 * Created by qsl on 2017/12/07
 */

public interface DataInfoDAO {

    //动态添加
    @InsertProvider(type = DataInfoDynaSqlProvider.class,method = "insertWithParams")
    void insert(DataInfo dataInfo);

    //根据id删除
    @Delete("delete from "+DATAINFO+" where id=#{id}")
    void delete(Integer id);

    //动态更新
    @UpdateProvider(type = DataInfoDynaSqlProvider.class,method = "updateWithParams")
    void update(DataInfo dataInfo);

    //根据id查询
    @Select("select * from "+DATAINFO+" where id=#{id}")
    DataInfo selectById(Integer id);

    //根据dataId查询
    @Select("select * from "+DATAINFO+" where datacat_id=#{datacatId}")
    List<DataInfo> selectByDataId(Integer dataId);

    //动态查询
    @SelectProvider(type = DataInfoDynaSqlProvider.class,method = "selectWithParams")
    List<DataInfo> selectWithParams(DataInfo dataInfo);

}
