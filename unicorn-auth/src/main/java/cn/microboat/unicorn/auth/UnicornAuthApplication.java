package cn.microboat.unicorn.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhouwei
 */
@EnableFeignClients(basePackages = "cn.microboat.api.system.service")
@SpringBootApplication
@EnableDiscoveryClient
public class UnicornAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnicornAuthApplication.class, args);
    }

}
