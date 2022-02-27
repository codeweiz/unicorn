package cn.microboat.unicorn.modules.system.service;

import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import cn.microboat.unicorn.modules.system.domain.vo.SysUserVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author zhouwei
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 不分页查询所有用户列表
     *
     * @return BasicReturn List SysUser
     * */
    BasicReturn<List<SysUser>> getSysUserList();

    /**
     * 增加用户
     *
     * @param sysUserVo 客户端传入
     *
     * @return BasicReturn SysUser
     * */
    BasicReturn<SysUser> addUser(SysUserVo sysUserVo);

    /**
     * 用户注册
     *
     * @param sysUserVo 客户端传入
     *
     * @return BasicReturn SysUser
     * */
    BasicReturn<SysUser> register(SysUserVo sysUserVo);

}
