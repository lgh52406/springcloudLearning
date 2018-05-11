package com.huiquan.servicehi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author lgh email:luguihua@witspring.com
 * @Description:
 * @Date 2018/5/9 13:59
 * @since Ver V
 */
@RestController
public class HelloController {
    private static final Logger LOGGER = Logger.getLogger(HelloController.class.getName());
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String callHome(){
        LOGGER.log(Level.INFO,"calling trace service-hi ");
        return restTemplate.getForObject("http://localhost:8103/miya",String.class);
    }

    @RequestMapping("/info")
    public String info(){
        LOGGER.info("calling trace service-hi ");
        return "i`m service-hi";
    }
}
