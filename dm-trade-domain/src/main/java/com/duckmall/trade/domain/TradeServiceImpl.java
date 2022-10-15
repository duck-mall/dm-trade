package com.duckmall.trade.domain;

import com.duckmall.trade.domain.dao.TradeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：xiong
 * @date ：Created in 2022/8/17 23:23
 * @description ：trade 领域服务
 */
@Service
public class TradeServiceImpl implements TradeService{
    @Autowired
    private TradeDao dao;
}
