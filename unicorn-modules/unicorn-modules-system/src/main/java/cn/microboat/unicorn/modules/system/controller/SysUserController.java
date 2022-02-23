package cn.microboat.unicorn.modules.system.controller;

import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import cn.microboat.unicorn.modules.system.service.impl.SysUserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhouwei
 */
@RestController
@RequestMapping("/sys")
public class SysUserController {

    @Resource
    private SysUserServiceImpl sysUserService;

    /**
     * 不分页查询所有用户列表
     * */
    @GetMapping("/user/list")
    public BasicReturn<List<SysUser>> getSysUserList() {
        return sysUserService.getSysUserList();
    }

}
