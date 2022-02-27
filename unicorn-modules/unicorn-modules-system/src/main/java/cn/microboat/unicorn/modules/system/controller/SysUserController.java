package cn.microboat.unicorn.modules.system.controller;

import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import cn.microboat.unicorn.modules.system.domain.vo.SysUserVo;
import cn.microboat.unicorn.modules.system.service.impl.SysUserServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhouwei
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController {

    @Resource
    private SysUserServiceImpl sysUserService;

    /**
     * 不分页查询所有用户列表
     * */
    @GetMapping("/list")
    public BasicReturn<List<SysUser>> getSysUserList() {
        return sysUserService.getSysUserList();
    }

    /**
     * 增加一个系统用户
     * */
    @PostMapping("/add")
    public BasicReturn<SysUser> addSysUser(@RequestBody SysUserVo sysUserVo) {
        return sysUserService.addUser(sysUserVo);
    }

}
