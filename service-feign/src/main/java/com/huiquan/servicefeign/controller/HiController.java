package com.huiquan.servicefeign.controller;

import com.huiquan.servicefeign.service.ScheddualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgh email:luguihua@witspring.com
 * @Description:
 * @Date 2018/5/7 15:48
 * @since Ver V
 */
@RestController
public class HiController {
    @Autowired
    ScheddualServiceHello scheddualServiceHello;

    @RequestMapping("/sayHey")
    public String sayHey(@RequestParam String name){
        return  scheddualServiceHello.sayHey(name);
    }
}
