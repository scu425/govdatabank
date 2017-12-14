package gov.data.bank.bean;

import java.io.Serializable;

/**
 * Created by zhc on 2017/11/20
 */
public class Provider implements Serializable {
    private Integer id;
    private String providerName;
    private String loginname;
    private String password;

    public Provider() {
    }

    public Provider( String providerName, String loginname, String password) {
        this.providerName = providerName;
        this.loginname = loginname;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "ProviderService{" +
                "id=" + id +
                ", providerName='" + providerName + '\'' +
                ", loginname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}