package com.huiquan.eurekaprovider2.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgh email:luguihua@witspring.com
 * @Description:
 * @Date 2018/5/7 14:34
 * @since Ver V
 */
@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/sayHey")
    @HystrixCommand(fallbackMethod = "helloError")
    public String sayHey(@RequestParam String name){
        return "hello " + name + " i`am lucy,this port is " + port;
    }

    public String helloError(String name){
        return "hello, " + name + " ,sorry,i`m error!";
    }
}
