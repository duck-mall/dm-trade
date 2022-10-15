package com.duckmall.trade.application;

import com.duckmall.trade.domain.TradeService;
import com.duckmall.trade.facade.TradeFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：xiong
 * @date ：Created in 2022/8/17 23:19
 * @description ：trade server
 */
@Service
public class TradeFacadeImpl implements TradeFacade {

    @Autowired
    private TradeService tradeService;
}
