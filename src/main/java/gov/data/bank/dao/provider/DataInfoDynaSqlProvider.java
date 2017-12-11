package gov.data.bank.dao.provider;

import gov.data.bank.bean.DataInfo;
import org.apache.ibatis.jdbc.SQL;

import static gov.data.bank.constant.GovDataBankConstant.DATAINFO;

/**
 * Created by imqsl on 2017-12-7.
 */
public class DataInfoDynaSqlProvider {
    public String insertWithParams(DataInfo dataInfo){
        return new SQL(){
            {
                INSERT_INTO(DATAINFO);
                if (dataInfo.getPrice()!=null&&!"".equals(dataInfo.getPrice())){
                    VALUES("price","#{price}");
                }
                if (dataInfo.getDataName()!=null&&!"".equals(dataInfo.getDataName())){
                    VALUES("data_name","#{dataName}");
                }
                if (dataInfo.getDatacatId()!=null&&!"".equals(dataInfo.getDatacatId())){
                    VALUES("datacat_id","#{datacatId}");
                }
                if (dataInfo.getFilePath()!=null&&!"".equals(dataInfo.getFilePath())){
                    VALUES("file_path","#{filePath}");
                }
                if (dataInfo.getDataTime()!=null&&!"".equals(dataInfo.getDataTime())){
                    VALUES("data_time","#{dataTime}");
                }
            }
        }.toString();

    }

    public String updateWithParams(DataInfo dataInfo){
        return new SQL(){
            {
                UPDATE(DATAINFO);
                if (dataInfo.getPrice()!=null&&!"".equals(dataInfo.getPrice())){
                    SET("price=#{price}");
                }
                if (dataInfo.getDataName()!=null&&!"".equals(dataInfo.getDataName())){
                    SET("data_name=#{dataName}");
                }
                if (dataInfo.getDatacatId()!=null&&!"".equals(dataInfo.getDatacatId())){
                    SET("datacat_id=#{datacatId}");
                }
                if (dataInfo.getFilePath()!=null&&!"".equals(dataInfo.getFilePath())){
                    SET("file_path=#{filePath}");
                }
                if (dataInfo.getDataTime()!=null&&!"".equals(dataInfo.getDataTime())){
                    SET("data_time=#{dataTime}");
                }
                WHERE("id=#{id}");

            }
        }.toString();
    }

    public String selectWithParams(DataInfo dataInfo){
        return new SQL(
        ){
            {
                SELECT("*");
                FROM(DATAINFO);
                if (dataInfo.getPrice()!=null&&!"".equals(dataInfo.getPrice())){
                    WHERE("price=#{price}");
                }
                if (dataInfo.getDataName()!=null&&!"".equals(dataInfo.getDataName())){
                    WHERE("data_name=#{dataName}");
                }
                if (dataInfo.getDatacatId()!=null&&!"".equals(dataInfo.getDatacatId())){
                    WHERE("datacat_id=#{datacatId}");
                }
                if (dataInfo.getFilePath()!=null&&!"".equals(dataInfo.getFilePath())){
                    WHERE("file_path=#{filePath}");
                }
                if (dataInfo.getDataTime()!=null&&!"".equals(dataInfo.getDataTime())){
                    WHERE("data_time=#{dataTime}");
                }
            }
        }.toString();
    }
}
