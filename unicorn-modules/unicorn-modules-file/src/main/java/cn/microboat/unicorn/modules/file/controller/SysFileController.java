package cn.microboat.unicorn.modules.file.controller;

import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.common.core.utils.FileUtils;
import cn.microboat.unicorn.modules.file.domain.SysFile;
import cn.microboat.unicorn.modules.file.service.SysFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author zhouwei
 */
@RestController
public class SysFileController {

    private static final Logger log = LoggerFactory.getLogger(SysFileController.class);

    @Resource
    private SysFileService sysFileService;

    @PostMapping(value = "/upload", headers = "content-type=multipart/form-data")
    public BasicReturn<SysFile> upload(@RequestParam("file") MultipartFile file) {
        String url;
        try {
            url = sysFileService.uploadFile(file);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("上传文件失败：", e);
            return BasicReturn.fail("上传文件失败");
        }
        SysFile sysFile = new SysFile();
        sysFile.setName(FileUtils.getName(url));
        sysFile.setUrl(url);
        return BasicReturn.ok(sysFile);
    }
}
