package gov.data.bank.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhc on 2017/11/20
 */
public class DataInfo implements Serializable {
    private Integer id;
    private String dataName;
    private Date dataTime;
    private Double price;
    private Integer datacatId;
    private String filePath;

    public DataInfo() {
    }

    public DataInfo(String dataName, Date dataTime, Double price, Integer datacatId, String filePath) {
        this.dataName = dataName;
        this.dataTime = dataTime;
        this.price = price;
        this.datacatId = datacatId;
        this.filePath = filePath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDatacatId() {
        return datacatId;
    }

    public void setDatacatId(Integer datacatId) {
        this.datacatId = datacatId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "DataInfo{" +
                "id='" + id + '\'' +
                ", dataName='" + dataName + '\'' +
                ", dataTime=" + dataTime +
                ", price=" + price +
                ", datacatId=" + datacatId +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
   /* DROP TABLE IF EXISTS `datainfo`;
        CREATE TABLE `datainfo` (
        `data_id` varchar(50) NOT NULL,
        `data_name` varchar(50) NOT NULL,
        `data_time` date NOT NULL,
        `price` decimal(10,0) NOT NULL,
        `datacat_id` int(10) NOT NULL,
        `file_path` varchar(255) DEFAULT NULL,
        PRIMARY KEY (`data_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/
