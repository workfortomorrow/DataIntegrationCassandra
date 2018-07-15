package com.beifa.cn.data.integration.spring.batch.reader.mapper;

import com.beifa.cn.data.integration.spring.batch.entities.TradeDate;
import com.datastax.driver.core.LocalDate;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
import java.util.UUID;

/**
 * @Author: duhongjiang
 * @Date: Created in 2018/7/13
 */
public class TradeDateFieldSetMapper implements FieldSetMapper<TradeDate> {
    @Override
    public TradeDate mapFieldSet(FieldSet fieldSet) throws BindException {
        TradeDate tradeDate =new TradeDate();
        tradeDate.setTradingDataDate(LocalDate.fromMillisSinceEpoch(System.currentTimeMillis()));
        tradeDate.setItemId(UUID.randomUUID());
        tradeDate.setStockCode(fieldSet.readString("stockCode"));
        tradeDate.setItemValue1(fieldSet.readDouble("itemValue1"));
        tradeDate.setItemValue2(fieldSet.readDouble("itemValue2"));
        tradeDate.setItemValue3(fieldSet.readDouble("itemValue3"));
        return tradeDate;
    }
}
