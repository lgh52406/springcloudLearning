package com.huiquan.serviceribbon.controller;

import com.huiquan.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgh email:luguihua@witspring.com
 * @Description:
 * @Date 2018/5/7 15:03
 * @since Ver V
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/sayHey")
    public String sayHey(@RequestParam String name){
        return helloService.sayHey(name);
    }
}
