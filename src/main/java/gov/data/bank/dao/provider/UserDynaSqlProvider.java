package gov.data.bank.dao.provider;

import gov.data.bank.bean.User;
import org.apache.ibatis.jdbc.SQL;

import static gov.data.bank.constant.GovDataBankConstant.USER;

/**
 * Created by imqsl on 2017-12-13.
 */
public class UserDynaSqlProvider {
    public String insertWithParams(User user){
        return new SQL(){
            {
                INSERT_INTO(USER);
                if (user.getEmail()!=null&&!"".equals(user.getEmail())){
                    VALUES("email","#{email}");
                }
                if (user.getNickname()!=null&&!"".equals(user.getNickname())){
                    VALUES("nickname","#{nickname}");
                }
                if (user.getPassword()!=null&&!"".equals(user.getPassword())){
                    VALUES("password","#{password}");
                }
                if (user.getPhone()!=null&&!"".equals(user.getPhone())){
                    VALUES("phone","#{phone}");
                }
                if (user.getUsername()!=null&&!"".equals(user.getUsername())){
                    VALUES("username","#{username}");
                }
            }
        }.toString();
    }

    public String updateWithParams(User user){
        return new SQL(){
            {
                UPDATE(USER);
                if (user.getEmail()!=null&&!"".equals(user.getEmail())){
                    SET("email=#{email}");
                }
                if (user.getNickname()!=null&&!"".equals(user.getNickname())){
                    SET("nickname=#{nickname}");
                }
                if (user.getPassword()!=null&&!"".equals(user.getPassword())){
                    SET("password=#{password}");
                }
                if (user.getPhone()!=null&&!"".equals(user.getPhone())){
                    SET("phone=#{phone}");
                }
                if (user.getUsername()!=null&&!"".equals(user.getUsername())){
                    SET("username=#{username}");
                }
                WHERE("id=#{id}");
            }
        }.toString();
    }
    public String selectWithParams(User user){
        return new SQL(){
            {
                SELECT("*");
                FROM(USER);
                if (user.getEmail()!=null&&!"".equals(user.getEmail())){
                    WHERE("email=#{email}");
                }
                if (user.getNickname()!=null&&!"".equals(user.getNickname())){
                    WHERE("nickname=#{nickname}");
                }
                if (user.getPassword()!=null&&!"".equals(user.getPassword())){
                    WHERE("password=#{password}");
                }
                if (user.getPhone()!=null&&!"".equals(user.getPhone())){
                    WHERE("phone=#{phone}");
                }
                if (user.getUsername()!=null&&!"".equals(user.getUsername())){
                    WHERE("username=#{username}");
                }
            }
        }.toString();
    }
}
