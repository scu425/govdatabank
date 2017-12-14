package gov.data.bank.dao.provider;

import gov.data.bank.bean.Manager;
import org.apache.ibatis.jdbc.SQL;

import static gov.data.bank.constant.GovDataBankConstant.MANAGER;

/**
 * Created by imqsl on 2017-12-13.
 */
public class ManagerDynaSqlProvider {


    public String updateWithParams(Manager manager) {
        return new SQL() {
            {
                UPDATE(MANAGER);
                if (manager.getLoginname()!=null&&!"".equals(manager.getLoginname())){
                    SET("loginname=#{loginname}");
                }
                if (manager.getPassword()!=null&&!"".equals(manager.getPassword())){
                    SET("password=#{password}");
                }
                WHERE("id=#{id}");
            }
        }.toString();

    }

}
