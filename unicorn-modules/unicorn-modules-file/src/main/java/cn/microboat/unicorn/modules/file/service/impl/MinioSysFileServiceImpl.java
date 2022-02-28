package cn.microboat.unicorn.modules.file.service.impl;

import cn.microboat.common.core.utils.DateUtils;
import cn.microboat.unicorn.modules.file.config.MinioConfig;
import cn.microboat.unicorn.modules.file.service.SysFileService;
import cn.microboat.unicorn.modules.file.utils.FileUploadUtils;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * 文件相关接口 minio 实现类
 *
 * @author zhouwei
 */
@Service
public class MinioSysFileServiceImpl implements SysFileService {

    @Resource
    private MinioConfig minioConfig;

    @Resource
    private MinioClient minioClient;

    /**
     * 文件上传接口
     *
     * @param file 上传的文件
     *
     * @return String 访问地址
     *
     * @throws Exception 异常
     * */
    @Override
    public String uploadFile(MultipartFile file) throws Exception {
        String filename = DateUtils.datePath() + "/" + file.getOriginalFilename();
        if (file.getOriginalFilename() == null) {
            filename = FileUploadUtils.extractFilename(file);
        }
        PutObjectArgs args = PutObjectArgs.builder()
                .bucket(minioConfig.getBucketName())
                .object(filename)
                .stream(file.getInputStream(), file.getSize(), -1)
                .contentType(file.getContentType())
                .build();
        minioClient.putObject(args);
        return minioConfig.getUrl() + "/" + minioConfig.getBucketName() + "/" + filename;
    }
}
