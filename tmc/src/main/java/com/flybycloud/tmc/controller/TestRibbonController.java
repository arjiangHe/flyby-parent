package com.flybycloud.tmc.controller;

import com.flybycloud.tmc.service.ITestRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hejiang
 * @date 2018/3/28
 */
@RestController
public class TestRibbonController {

    @Autowired
    private ITestRibbonService testRibbonService;

    @GetMapping(value = "/test/ribbon")
    public String testRibbon(@RequestParam String id){
        return testRibbonService.testRibbon(id);
    }
}
