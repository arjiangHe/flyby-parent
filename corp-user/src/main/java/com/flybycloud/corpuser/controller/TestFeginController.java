package com.flybycloud.corpuser.controller;

import com.flybycloud.corpuser.service.ITestFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hejiang
 * @date 2018/3/28
 */
@RestController
public class TestFeginController {

    @Autowired
    private ITestFeginService testFeginService;

    @GetMapping(value = "/test/fegin")
    public String testFegin(@RequestParam String id){
        return testFeginService.testFegin(id);
    }
}
