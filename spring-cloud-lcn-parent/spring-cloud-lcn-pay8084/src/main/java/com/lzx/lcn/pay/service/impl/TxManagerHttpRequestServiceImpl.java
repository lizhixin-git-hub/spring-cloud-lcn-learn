package com.lzx.lcn.pay.service.impl;

import com.codingapi.tx.netty.service.TxManagerHttpRequestService;
import com.lorne.core.framework.utils.http.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

//与tx-manager通讯请求实现类
@Service
public class TxManagerHttpRequestServiceImpl implements TxManagerHttpRequestService {

    private Logger logger = LoggerFactory.getLogger(TxManagerHttpRequestServiceImpl.class);

    @Override
    public String httpGet(String url) {
        logger.debug("httpGet-start");
        String res = HttpUtils.get(url);
        logger.debug("httpGet-end");
        return res;
    }

    @Override
    public String httpPost(String url, String params) {
        logger.debug("httpPost-start");
        String res = HttpUtils.post(url, params);
        logger.debug("httpPost-end");
        return res;
    }

}
