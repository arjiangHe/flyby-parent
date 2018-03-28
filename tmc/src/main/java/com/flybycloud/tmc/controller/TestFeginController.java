package com.flybycloud.tmc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hejiang
 * @date 2018/3/28
 */
@RestController
public class TestFeginController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/test/fegin")
    public String testFegin(@RequestParam String id){
        return "id=" + id + ",port=" + port;
    }
}
