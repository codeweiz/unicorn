package cn.microboat.unicorn.modules.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhouwei
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UnicornModulesSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnicornModulesSystemApplication.class, args);
    }

}
