package gov.data.bank.dao.provider;

import gov.data.bank.bean.DataCat;
import org.apache.ibatis.jdbc.SQL;

import static gov.data.bank.constant.GovDataBankConstant.DATACAT;

/**
 * Created by imqsl on 2017-12-8.
 */
public class DataCatDynaSqlProvider {
    public String insertWithParams(DataCat dataCat){
        return new SQL(){
            {
                INSERT_INTO(DATACAT);
                if (dataCat.getArea()!=null&&!"".equals(dataCat.getArea())){
                    VALUES("area","#{area}");
                }
                if (dataCat.getDataAbstract()!=null&&!"".equals(dataCat.getDataAbstract())){
                    VALUES("data_abstract","#{dataAbstract}");
                }
                if (dataCat.getIndustry()!=null&&!"".equals(dataCat.getIndustry())){
                    VALUES("industry","#{industry}");
                }
                if (dataCat.getKeyword()!=null&&!"".equals(dataCat.getKeyword())){
                    VALUES("keyword","#{keyword}");
                }
                if (dataCat.getMaintenance()!=null&&!"".equals(dataCat.getMaintenance())){
                    VALUES("maintenance","#{maintenance}");
                }
                if (dataCat.getProvider()!=null&&!"".equals(dataCat.getProvider())){
                    VALUES("provider","#{provider}");
                }
                if (dataCat.getSecurityLevel()!=null&&!"".equals(dataCat.getSecurityLevel())){
                    VALUES("security_level","#{securityLevel}");
                }
                if (dataCat.getTopic()!=null&&!"".equals(dataCat.getTopic())){
                    VALUES("topic","#{topic}");
                }
                if (dataCat.getUpdateFreq()!=null&&!"".equals(dataCat.getUpdateFreq())){
                    VALUES("update_freq","#{updateFreq}");
                }
                if (dataCat.getUpdateTime()!=null&&!"".equals(dataCat.getUpdateTime())){
                    VALUES("update_time","#{updateTime}");
                }
            }
        }.toString();
    }
    public String updateWithParams(DataCat dataCat){
        return new SQL(){
            {
                UPDATE(DATACAT);
                if (dataCat.getArea()!=null&&!"".equals(dataCat.getArea())){
                    SET("area=#{area}");
                }
                if (dataCat.getDataAbstract()!=null&&!"".equals(dataCat.getDataAbstract())){
                    SET("abstract=#{dataAbstract}");
                }
                if (dataCat.getIndustry()!=null&&!"".equals(dataCat.getIndustry())){
                    SET("industry=#{industry}");
                }
                if (dataCat.getKeyword()!=null&&!"".equals(dataCat.getKeyword())){
                    SET("keyword=#{keyword}");
                }
                if (dataCat.getMaintenance()!=null&&!"".equals(dataCat.getMaintenance())){
                    SET("maintenance=#{maintenance}");
                }
                if (dataCat.getProvider()!=null&&!"".equals(dataCat.getProvider())){
                    SET("provider=#{provider}");
                }
                if (dataCat.getSecurityLevel()!=null&&!"".equals(dataCat.getSecurityLevel())){
                    SET("security_level=#{securityLevel}");
                }
                if (dataCat.getTopic()!=null&&!"".equals(dataCat.getTopic())){
                    SET("topic=#{topic}");
                }
                if (dataCat.getUpdateFreq()!=null&&!"".equals(dataCat.getUpdateFreq())){
                    SET("update_freq=#{updateFreq}");
                }
                if (dataCat.getUpdateTime()!=null&&!"".equals(dataCat.getUpdateTime())){
                    SET("update_time=#{updateTime}");
                }
            }
        }.toString();
    }
    public String selectWithParams(DataCat dataCat){
        return new SQL(){
            {
                SELECT("*");
                FROM(DATACAT);
                if (dataCat.getArea()!=null&&!"".equals(dataCat.getArea())){
                    WHERE("area LIKE CONCAT ('%',#{area},'%')");
                }
                if (dataCat.getDataAbstract()!=null&&!"".equals(dataCat.getDataAbstract())){
                    WHERE("abstract LIKE CONCAT ('%',#{dataAbstract},'%')");
                }
                if (dataCat.getIndustry()!=null&&!"".equals(dataCat.getIndustry())){
                    WHERE("industry LIKE CONCAT ('%',#{industry},'%')");
                }
                if (dataCat.getKeyword()!=null&&!"".equals(dataCat.getKeyword())){
                    WHERE("keyword LIKE CONCAT ('%',#{keyword},'%')");
                }
                if (dataCat.getMaintenance()!=null&&!"".equals(dataCat.getMaintenance())){
                    WHERE("maintenance LIKE CONCAT ('%',#{maintenance},'%')");
                }
                if (dataCat.getProvider()!=null&&!"".equals(dataCat.getProvider())){
                    WHERE("provider LIKE CONCAT ('%',#{provider},'%')");
                }
                if (dataCat.getTopic()!=null&&!"".equals(dataCat.getTopic())){
                    WHERE("topic LIKE CONCAT ('%',#{area},'%')");
                }

            }
        }.toString();
    }
}
