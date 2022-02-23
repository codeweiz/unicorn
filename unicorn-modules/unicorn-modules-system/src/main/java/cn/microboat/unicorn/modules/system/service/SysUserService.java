package cn.microboat.unicorn.modules.system.service;

import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.unicorn.modules.system.domain.SysUser;

import java.util.List;

/**
 * @author zhouwei
 */
public interface SysUserService {

    /**
     * 不分页查询所有用户列表
     *
     * @return BasicReturn List SysUser
     * */
    BasicReturn<List<SysUser>> getSysUserList();

}
