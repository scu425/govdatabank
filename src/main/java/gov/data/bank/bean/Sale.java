package gov.data.bank.bean;

import java.io.Serializable;

/**
 * Created by zhc on 2017/11/20
 */
public class Sale implements Serializable {
    private Integer saleId;
    private String dataId;
    private Integer userId;
    private Double total;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
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
}
   /* DROP TABLE IF EXISTS `sale`;
        CREATE TABLE `sale` (
        `sale_id` int(10) NOT NULL AUTO_INCREMENT,
        `data_id` varchar(50) NOT NULL,
        `user_id` int(10) NOT NULL,
        `total` decimal(10,0) NOT NULL,
        PRIMARY KEY (`sale_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/