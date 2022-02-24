package cn.microboat.unicorn.auth.service;

import cn.microboat.api.system.service.RemoteSysUserService;
import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.unicorn.modules.system.domain.SysUser;
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

    public BasicReturn<List<SysUser>> getAllUser() {
        return remoteSysUserService.getSysUserList();
    }

}
