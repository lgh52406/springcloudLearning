package com.huiquan.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author lgh email:luguihua@witspring.com
 * @Description:
 * @Date 2018/5/7 16:41
 * @since Ver V
 */
@Component
public class ScheddualServiceHelloHystric implements ScheddualServiceHello {
    @Override
    public String sayHey(String name) {
        return "sorry," + name + "i`am error";
    }
}
