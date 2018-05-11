package com.huiquan.serviceturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author lgh
 */
@SpringBootApplication
@EnableTurbine
public class ServiceTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTurbineApplication.class, args);
//		new SpringApplicationBuilder(ServiceTurbineApplication.class).web(true).run(args);
	}
}
