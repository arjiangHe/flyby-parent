package com.flybycloud.corpuser.service.impl;

import com.flybycloud.corpuser.service.ITestFeginService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hejiang
 * @date 2018/3/28
 */
@Component
public class SchedualServiceTestFeginHystric implements ITestFeginService {

    @Value("${server.port}")
    private String port;

    @Override
    public String testFegin(@RequestParam(value = "id") String id) {
        return "id=" + id + ",port=" + port + "发生错误啦";
    }
}
