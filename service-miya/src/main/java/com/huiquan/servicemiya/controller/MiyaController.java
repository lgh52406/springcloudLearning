package com.huiquan.servicemiya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

/**
 * @author lgh email:luguihua@witspring.com
 * @Description:
 * @Date 2018/5/9 14:25
 * @since Ver V
 */
@RestController
public class MiyaController {

    private static final Logger LOGGER = Logger.getLogger(MiyaController.class.getName());
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String home(){
        LOGGER.info("hi is heing called");
        return "hi i`m miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        LOGGER.info("info is being called");
        return restTemplate.getForObject("http://localhost:8102/info",String.class);
    }
}
