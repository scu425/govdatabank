package gov.data.bank.dao.provider;

import gov.data.bank.bean.DataCat;
import gov.data.bank.bean.Sale;
import org.apache.ibatis.jdbc.SQL;

import static gov.data.bank.constant.GovDataBankConstant.SALE;

/**
 * Created by imqsl on 2017-12-8.
 */
public class SaleDynaSqlProvider {
    public String insertWithParams(Sale sale){
        return new SQL(){
            {
                INSERT_INTO(SALE);
                if (sale.getDataId()!=null&&!"".equals(sale.getDataId())){
                    VALUES("data_id","#{dataId}");
                }
                if (sale.getUserId()!=null&&!"".equals(sale.getUserId())){
                    VALUES("user_id","#{userId}");
                }
                if (sale.getTotal()!=null&&!"".equals(sale.getTotal())){
                    VALUES("total","#{total}");
                }

            }
        }.toString();
    }
    public String updateWithParams(Sale sale){
        return new SQL(){
            {
                UPDATE(SALE);
                if (sale.getDataId()!=null&&!"".equals(sale.getDataId())){
                    SET("data_id=#{dataId}");
                }
                if (sale.getUserId()!=null&&!"".equals(sale.getUserId())){
                    SET("user_id=#{userId}");
                }
                if (sale.getTotal()!=null&&!"".equals(sale.getTotal())){
                    SET("total=#{total}");
                }
            }
        }.toString();
    }
    public String selectWithParams(Sale sale){
        return new SQL(){
            {
                SELECT("*");
                FROM(SALE);
                if (sale.getDataId()!=null&&!"".equals(sale.getDataId())){
                    WHERE("data_id=#{dataId}");
                }
                if (sale.getUserId()!=null&&!"".equals(sale.getUserId())){
                    WHERE("user_id=#{userId}");
                }

            }
        }.toString();
    }
}
