package cn.microboat.unicorn.modules.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 文件服务启动类
 * 跳过数据源自动配置
 *
 * @author zhouwei
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class UnicornModulesFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnicornModulesFileApplication.class, args);
    }

}
