package com.huiquan.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lgh email:luguihua@witspring.com
 * @Description:
 * @Date 2018/5/7 15:46
 * @since Ver V
 */
@FeignClient(value = "eureka-provider",fallback = ScheddualServiceHelloHystric.class)
public interface ScheddualServiceHello {

    @RequestMapping(value = "/sayHey",method = RequestMethod.GET)
    String sayHey(@RequestParam(value = "name") String name);
}
