package cn.microboat.api.system.factories;

import cn.microboat.api.system.service.RemoteSysUserService;
import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhouwei
 */
@Component
public class RemoteSysUserFallbackFactory implements RemoteSysUserService {
    @Override
    public BasicReturn<List<SysUser>> getSysUserList() {
        return BasicReturn.fail("用户获取失败！");
    }
}
