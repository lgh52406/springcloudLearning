package com.huiquan.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lgh email:luguihua@witspring.com
 * @Description:
 * @Date 2018/5/7 14:55
 * @since Ver V
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayError")
    public String sayHey(String name){
        return restTemplate.getForObject("http://eureka-provider/sayHey?name="+name,String.class);
    }

    public String sayError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
