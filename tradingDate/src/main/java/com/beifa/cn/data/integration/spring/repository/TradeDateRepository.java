package com.beifa.cn.data.integration.spring.repository;

import com.beifa.cn.data.integration.spring.batch.entities.TradeDate;
import org.springframework.data.repository.CrudRepository;


/**
 * @Author: duhongjiang
 * @Date: Created in 2018/7/13
 */

public interface TradeDateRepository extends CrudRepository<TradeDate,String> {


}
