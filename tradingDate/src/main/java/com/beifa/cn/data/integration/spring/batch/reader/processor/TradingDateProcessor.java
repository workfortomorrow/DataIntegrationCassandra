package com.beifa.cn.data.integration.spring.batch.reader.processor;

import com.beifa.cn.data.integration.spring.batch.entities.TradeDate;
import org.springframework.batch.item.ItemProcessor;

/**
 * @Author: duhongjiang
 * @Date: Created in 2018/7/13
 */
public class TradingDateProcessor implements ItemProcessor<TradeDate,TradeDate> {

    @Override
    public TradeDate process(TradeDate tradeDate) throws Exception {
        return tradeDate;
    }
}
