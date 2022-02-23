package cn.microboat.api.system.service;

import cn.microboat.api.system.factories.RemoteSysUserFallbackFactory;
import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author zhouwei
 */
@FeignClient(contextId = "remoteUserService", value = "unicorn-system", fallbackFactory = RemoteSysUserFallbackFactory.class)
public interface RemoteSysUserService {

    /**
     * 不分页查询所有用户列表
     *
     * @return BasicReturn List SysUser
     * */
    @GetMapping("/sys/user/list")
    BasicReturn<List<SysUser>> getSysUserList();

}
