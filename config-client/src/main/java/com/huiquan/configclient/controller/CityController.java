package com.huiquan.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgh email:luguihua@witspring.com
 * @Description:
 * @Date 2018/5/8 14:46
 * @since Ver V
 */
@RestController
@RefreshScope
public class CityController {
    @Value("${city}")
    private String city;
    @RequestMapping("/getCity")
    public String getCity(){
        return city;
    }
}
