package gov.data.bank.bean;

import java.io.Serializable;

/**
 * Created by zhc on 2017/11/20
 */
public class Sale implements Serializable {
    private Integer id;
    private Integer dataId;
    private Integer userId;
    private Double total;

    public Sale() {
    }

    public Sale(Integer dataId, Integer userId, Double total) {
        this.dataId = dataId;
        this.userId = userId;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", dataId='" + dataId + '\'' +
                ", userId=" + userId +
                ", total=" + total +
                '}';
    }
}
   /* DROP TABLE IF EXISTS `sale`;
        CREATE TABLE `sale` (
        `sale_id` int(10) NOT NULL AUTO_INCREMENT,
        `data_id` varchar(50) NOT NULL,
        `user_id` int(10) NOT NULL,
        `total` decimal(10,0) NOT NULL,
        PRIMARY KEY (`sale_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/