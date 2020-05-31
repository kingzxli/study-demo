package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker  //对Hystrix 熔断机制对支持
public class DeptProvider8001 {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001.class, args);
	}

}
