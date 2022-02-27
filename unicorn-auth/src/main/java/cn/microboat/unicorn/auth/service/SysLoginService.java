package cn.microboat.unicorn.auth.service;

import cn.microboat.api.system.service.RemoteSysUserService;
import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import cn.microboat.unicorn.modules.system.domain.vo.SysUserVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhouwei
 */
@Service
public class SysLoginService {

    @Resource
    private RemoteSysUserService remoteSysUserService;

    /**
     * 不分页获取所有系统用户
     *
     * @return BasicReturn List SysUser
     * */
    public BasicReturn<List<SysUser>> getAllUser() {
        return remoteSysUserService.getSysUserList();
    }

    /**
     * 增加一个系统用户
     *
     * @param sysUserVo 系统用户
     *
     * @return BasicReturn SysUser
     * */
    public BasicReturn<SysUser> addSysUser(SysUserVo sysUserVo) {
        return remoteSysUserService.addSysUser(sysUserVo);
    }

    /**
     * 用户注册
     *
     * @param sysUserVo 客户端传入
     *
     * @return BasicReturn SysUser
     * */
    public BasicReturn<SysUser> register(SysUserVo sysUserVo) {
        return remoteSysUserService.register(sysUserVo);
    }

}
