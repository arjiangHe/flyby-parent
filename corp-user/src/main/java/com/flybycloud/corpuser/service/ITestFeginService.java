package com.flybycloud.corpuser.service;

import com.flybycloud.corpuser.service.impl.SchedualServiceTestFeginHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hejiang
 * @date 2018/3/28
 */
@FeignClient(value = "tmc" ,fallback = SchedualServiceTestFeginHystric.class)
public interface ITestFeginService {

    @GetMapping(value = "/test/fegin")
    String testFegin(@RequestParam(value = "id") String id);
}
