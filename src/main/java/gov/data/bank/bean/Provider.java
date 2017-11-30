package gov.data.bank.bean;

import java.io.Serializable;

/**
 * Created by zhc on 2017/11/20
 */
public class Provider implements Serializable {
    private Integer providerId;
    private String providerName;
    private String loginname;
    private String password;

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
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
/*
    DROP TABLE IF EXISTS `provider`;
        CREATE TABLE `provider` (
        `provider_id` int(10) NOT NULL AUTO_INCREMENT,
        `provider_name` varchar(50) NOT NULL,
        `loginname` varchar(50) NOT NULL,
        `password` varchar(50) NOT NULL,
        PRIMARY KEY (`provider_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/
