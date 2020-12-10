package com.lzx.lcn.pay.service.impl;

import com.codingapi.tx.config.service.TxManagerTxUrlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//获取tx-manager路径实现类（实现tc与tx-manager的通讯）
@Service
public class TxManagerTxUrlServiceImpl implements TxManagerTxUrlService {

    private Logger logger = LoggerFactory.getLogger(TxManagerTxUrlServiceImpl.class);

    @Value("${tx.manager.url}")
    private String url;

    @Override
    public String getTxUrl() {
        logger.debug("tx-manager url is:{}", url);

        return url;
    }

}
