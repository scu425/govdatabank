package gov.data.bank.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhc on 2017/11/20
 */
public class DataCat implements Serializable{
    private Integer id;
    private String area;
    private String dataAbstract;
    private String keyword;
    private String topic;
    private String industry;
    private String updateFreq;
    private Date updateTime;
    private String provider;
    private String maintenance;
    private String securityLevel;

    public DataCat() {
    }

    public DataCat(String area, String dataAbstract, String keyword, String topic, String industry, String updateFreq, Date updateTime, String provider, String maintenance, String securityLevel) {
        this.area = area;
        this.dataAbstract = dataAbstract;
        this.keyword = keyword;
        this.topic = topic;
        this.industry = industry;
        this.updateFreq = updateFreq;
        this.updateTime = updateTime;
        this.provider = provider;
        this.maintenance = maintenance;
        this.securityLevel = securityLevel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDataAbstract() {
        return dataAbstract;
    }

    public void setDataAbstract(String dataAbstract) {
        this.dataAbstract = dataAbstract;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getUpdateFreq() {
        return updateFreq;
    }

    public void setUpdateFreq(String updateFreq) {
        this.updateFreq = updateFreq;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    @Override
    public String toString() {
        return "DataCat{" +
                "id=" + id +
                ", area='" + area + '\'' +
                ", dataAbstract='" + dataAbstract + '\'' +
                ", keyword='" + keyword + '\'' +
                ", topic='" + topic + '\'' +
                ", industry='" + industry + '\'' +
                ", updateFreq='" + updateFreq + '\'' +
                ", updateTime=" + updateTime +
                ", provider='" + provider + '\'' +
                ", maintenance='" + maintenance + '\'' +
                ", securityLevel='" + securityLevel + '\'' +
                '}';
    }
}
 /*   DROP TABLE IF EXISTS `datacat`;
        CREATE TABLE `datacat` (
        `cat_id` int(10) NOT NULL,
        `area` varchar(50) DEFAULT NULL,
        `data_abstract` varchar(50) DEFAULT NULL,
        `keyword` varchar(50) DEFAULT NULL,
        `topic` varchar(50) DEFAULT NULL,
        `industry` varchar(50) DEFAULT NULL,
        `update_freq` varchar(50) DEFAULT NULL,
        `update_time` date DEFAULT NULL,
        `provider` varchar(50) DEFAULT NULL COMMENT '数据提供方',
        `maintenance` varchar(50) DEFAULT NULL COMMENT '维护方',
        `security_level` varchar(50) DEFAULT NULL,
        PRIMARY KEY (`cat_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/