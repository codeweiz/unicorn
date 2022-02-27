package cn.microboat.unicorn.modules.system.mapper;

import cn.microboat.common.core.mapper.IBaseMapper;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import cn.microboat.unicorn.modules.system.domain.vo.SysUserVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * SysUserVo, SysUser 相互转换
 *
 * @author zhouwei
 */
@Mapper
public interface SysUserConvertMapper extends IBaseMapper<SysUserVo, SysUser> {
    SysUserConvertMapper INSTANCE = Mappers.getMapper(SysUserConvertMapper.class);
}
