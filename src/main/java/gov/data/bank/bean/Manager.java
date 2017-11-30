package gov.data.bank.bean;

import java.io.Serializable;

/**
 * Created by zhc on 2017/11/20
 */
public class Manager implements Serializable {
    private Integer managerId;
    private String loginname;
    private String password;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
  /*  DROP TABLE IF EXISTS `manager`;
        CREATE TABLE `manager` (
        `managerid` int(10) NOT NULL AUTO_INCREMENT,
        `loginname` varchar(50) NOT NULL,
        `password` varchar(50) NOT NULL,
        PRIMARY KEY (`managerid`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/