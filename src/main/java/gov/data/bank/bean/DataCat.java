package gov.data.bank.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhc on 2017/11/20
 */
public class DataCat implements Serializable{
    private Integer catId;
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

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
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