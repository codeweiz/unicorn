package cn.microboat.unicorn.modules.system.service.impl;

import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import cn.microboat.unicorn.modules.system.mapper.SysUserMapper;
import cn.microboat.unicorn.modules.system.service.SysUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhouwei
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public BasicReturn<List<SysUser>> getSysUserList() {
        return BasicReturn.ok(sysUserMapper.selectList(new QueryWrapper<>()));
    }
}
