package gov.data.bank.bean;

import java.io.Serializable;

/**
 * Created by zhc on 2017/11/20
 */
public class User implements Serializable {
    private Integer userId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private String email;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
    /*DROP TABLE IF EXISTS `user`;
        CREATE TABLE `user` (
        `user_id` int(10) NOT NULL AUTO_INCREMENT,
        `username` varchar(50) NOT NULL,
        `password` varchar(50) NOT NULL,
        `nickname` varchar(50) NOT NULL,
        `phone` varchar(20) NOT NULL,
        `email` varchar(50) DEFAULT NULL,
        PRIMARY KEY (`user_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/