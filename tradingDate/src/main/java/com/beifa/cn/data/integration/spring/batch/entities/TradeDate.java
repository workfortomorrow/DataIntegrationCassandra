package com.beifa.cn.data.integration.spring.batch.entities;

import com.datastax.driver.core.LocalDate;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.io.Serializable;
import java.util.UUID;

/**
 * @Author: duhongjiang
 * @Date: Created in 2018/7/13
 */

@Table(value = "time_series_data")
public class TradeDate implements Serializable {

   private static final long serialVersionUID =1L;
    @PrimaryKey(value="item_id")
    private UUID itemId;
    @Column(value="trading_date")
    private LocalDate tradingDataDate;
    @Column(value="stock_code")
    private String stockCode;
    @Column(value="item_value1")
    private Double itemValue1;
    @Column(value="item_value2")
    private Double itemValue2;
    @Column(value="item_value3")
    private Double itemValue3;

    public TradeDate(){

    }

    public TradeDate(String stockCode, Double itemValue1, Double itemValue2, Double itemValue3) {
        this.stockCode = stockCode;
        this.itemValue1 = itemValue1;
        this.itemValue2 = itemValue2;
        this.itemValue3 = itemValue3;
    }

    public TradeDate(UUID itemId, LocalDate tradingDataDate, String stockCode, Double itemValue1, Double itemValue2, Double itemValue3) {
        this.itemId = itemId;
        this.tradingDataDate = tradingDataDate;
        this.stockCode = stockCode;
        this.itemValue1 = itemValue1;
        this.itemValue2 = itemValue2;
        this.itemValue3 = itemValue3;
    }

    public UUID getItemId() {
        return itemId;
    }

    public void setItemId(UUID itemId) {
        this.itemId = itemId;
    }

    public LocalDate getTradingDataDate() {
        return tradingDataDate;
    }

    public void setTradingDataDate(LocalDate tradingDataDate) {
        this.tradingDataDate = tradingDataDate;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Double getItemValue1() {
        return itemValue1;
    }

    public void setItemValue1(Double itemValue1) {
        this.itemValue1 = itemValue1;
    }

    public Double getItemValue2() {
        return itemValue2;
    }

    public void setItemValue2(Double itemValue2) {
        this.itemValue2 = itemValue2;
    }

    public Double getItemValue3() {
        return itemValue3;
    }

    public void setItemValue3(Double itemValue3) {
        this.itemValue3 = itemValue3;
    }
}
