package gov.data.bank.dao.provider;

import gov.data.bank.bean.Provider;
import org.apache.ibatis.jdbc.SQL;

import static gov.data.bank.constant.GovDataBankConstant.PROVIDER;

/**
 * Created by imqsl on 2017-12-13.
 */
public class ProviderDynaSqlProvider {
    public String insertWithParams(Provider provider){

        return new SQL(){
            {
                INSERT_INTO(PROVIDER);
                if (provider.getLoginname()!=null&&!"".equals(provider.getLoginname())){
                    VALUES("loginname","#{loginname}");
                }
                if (provider.getPassword()!=null&&!"".equals(provider.getPassword())){
                    VALUES("password","#{password}");
                }
                if (provider.getProviderName()!=null&&!"".equals(provider.getProviderName())){
                    VALUES("provider_name","#{providerName}");
                }
            }
        }.toString();
    }

    public String updateWithParams(Provider provider){

        return new SQL(){
            {
                UPDATE(PROVIDER);
                if (provider.getLoginname()!=null&&!"".equals(provider.getLoginname())){
                    SET("loginname=#{loginname}");
                }
                if (provider.getPassword()!=null&&!"".equals(provider.getPassword())){
                    SET("password=#{password}");
                }
                if (provider.getProviderName()!=null&&!"".equals(provider.getProviderName())){
                    SET("provider_name=#{providerName}");
                }
                WHERE("id=#{id}");
            }
        }.toString();
    }

    public String selectWithParams(Provider provider){

        return new SQL(){
            {
                SELECT("*");
                FROM(PROVIDER);
                if (provider.getLoginname()!=null&&!"".equals(provider.getLoginname())){
                    WHERE("loginname=#{loginname}");
                }
                if (provider.getPassword()!=null&&!"".equals(provider.getPassword())){
                    WHERE("password=#{password}");
                }
                if (provider.getProviderName()!=null&&!"".equals(provider.getProviderName())){
                    WHERE("provider_name=#{providerName}");
                }
            }
        }.toString();
    }

}
