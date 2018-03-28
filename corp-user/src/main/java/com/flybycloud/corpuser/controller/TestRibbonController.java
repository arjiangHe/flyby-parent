package com.flybycloud.corpuser.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试ribbon访问
 * @author hejiang
 * @date 2018/3/28
 */
@RestController
public class TestRibbonController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/test/ribbon")
    public String testRibbon(@RequestParam String id){
        return "id=" + id + ",port=" + port;
    }
}
