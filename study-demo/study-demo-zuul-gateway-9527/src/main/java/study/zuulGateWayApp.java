package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网管域名/服务名/方法路径
 * http://localhost:9527/study-demo-dept/dept/1
 * 访问映射
 * http://localhost:9527/study/mydept/dept/1
 * @author king
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class zuulGateWayApp {
	public static void main(String[] args) {
		SpringApplication.run(zuulGateWayApp.class, args);
	}

}
