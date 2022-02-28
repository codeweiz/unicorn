package cn.microboat.unicorn.modules.file.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 文件相关接口
 *
 * @author zhouwei
 */
public interface SysFileService {

    /**
     * 文件上传接口
     *
     * @param file 上传的文件
     *
     * @return String 访问地址
     *
     * @throws Exception 异常
     * */
    String uploadFile(MultipartFile file) throws Exception;
}
