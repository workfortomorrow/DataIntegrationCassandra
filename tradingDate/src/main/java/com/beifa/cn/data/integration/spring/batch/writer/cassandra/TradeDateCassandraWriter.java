package com.beifa.cn.data.integration.spring.batch.writer.cassandra;

import com.beifa.cn.data.integration.spring.repository.TradeDateRepository;
import com.beifa.cn.data.integration.spring.batch.entities.TradeDate;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: duhongjiang
 * @Date: Created in 2018/7/13
 */
public class TradeDateCassandraWriter implements ItemWriter<TradeDate> {

    @Autowired
    TradeDateRepository tradeDateRepository;

    @Override
    public void write(List<? extends TradeDate> list) throws Exception {

        for(TradeDate tradeDate:list){

            tradeDateRepository.save(tradeDate);

        }
    }
}
