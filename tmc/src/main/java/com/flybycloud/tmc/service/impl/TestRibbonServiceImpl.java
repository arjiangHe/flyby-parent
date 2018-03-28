package com.flybycloud.tmc.service.impl;

import com.flybycloud.tmc.service.ITestRibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 测试ribbon 服务之间的调用
 * @author hejiang
 * @date 2018/3/28
 */
@Service
public class TestRibbonServiceImpl implements ITestRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    //断路器
    @HystrixCommand(fallbackMethod = "testRibbonError")
    public String testRibbon(String id){
        return restTemplate.getForObject("http://corp-user/test/ribbon?id=" + id, String.class);
    }

    public String testRibbonError(String id){
        return "id=" + id + ",port=" + port + "发生错误啦";
    }

}
