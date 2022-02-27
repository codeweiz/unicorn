package cn.microboat.api.system.service;

import cn.microboat.api.system.factories.RemoteSysUserFallbackFactory;
import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import cn.microboat.unicorn.modules.system.domain.vo.SysUserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author zhouwei
 */
@FeignClient(contextId = "remoteSysUserService", value = "unicorn-system", fallbackFactory = RemoteSysUserFallbackFactory.class)
public interface RemoteSysUserService {

    /**
     * 不分页查询所有用户列表
     *
     * @return BasicReturn List SysUser
     * */
    @GetMapping("/sys/user/list")
    BasicReturn<List<SysUser>> getSysUserList();

    /**
     * 增加一个系统用户
     *
     * @param sysUserVo 用户传入参数
     *
     * @return BasicReturn SysUser
     * */
    @PostMapping("/sys/user/add")
    BasicReturn<SysUser> addSysUser(SysUserVo sysUserVo);

}
