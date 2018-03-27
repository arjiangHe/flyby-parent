package com.flybycloud.corpuser.controller;

import com.alibaba.fastjson.JSON;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author hejiang
 * @date 2018/3/27
 */
@RestController
public class GithubController {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());

    @RequestMapping(value = "/test/github")
    public void testGitHub(HttpServletRequest request){
        Map<String, String[]> map = request.getParameterMap() ;
        logger.info(JSON.toJSONString(map));
    }
}
