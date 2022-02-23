package cn.microboat.unicorn.modules.system.mapper;

import cn.microboat.unicorn.modules.system.domain.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhouwei
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}
