package cn.microboat.unicorn.auth.controller;

import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.unicorn.auth.service.SysLoginService;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhouwei
 */
@RestController
public class TokenController {

    @Resource
    private SysLoginService sysLoginService;

    @GetMapping("/user/list")
    public BasicReturn<List<SysUser>> getAllUser() {
        return sysLoginService.getAllUser();
    }

}
