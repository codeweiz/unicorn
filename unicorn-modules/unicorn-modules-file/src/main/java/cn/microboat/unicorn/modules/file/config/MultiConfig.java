package cn.microboat.unicorn.modules.file.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import javax.servlet.MultipartConfigElement;

/**
 * Tomcat 上传文件配置
 *
 * @author zhouwei
 */
@Configuration
public class MultiConfig {

    /**
     * 是否开启提升上传文件大小限制
     * */
    @Value("${spring.http.multipart.enabled}")
    private boolean enabled;

    /**
     * 单个文件最大尺寸
     * */
    @Value("${spring.http.multipart.max-file-size}")
    private String maxFileSize;

    /**
     * 一次请求中所有文件最大尺寸
     * */
    @Value("${spring.http.multipart.max-request-size}")
    private String maxRequestSize;

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        if (enabled) {
            factory.setMaxFileSize(DataSize.parse(maxFileSize, DataUnit.MEGABYTES));
            factory.setMaxRequestSize(DataSize.parse(maxRequestSize, DataUnit.MEGABYTES));
        }
        return factory.createMultipartConfig();
    }
}
