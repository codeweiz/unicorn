package cn.microboat.unicorn.modules.system.service.impl;

import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.common.core.text.UUID;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import cn.microboat.unicorn.modules.system.domain.vo.SysUserVo;
import cn.microboat.unicorn.modules.system.mapper.SysUserConvertMapper;
import cn.microboat.unicorn.modules.system.mapper.SysUserMapper;
import cn.microboat.unicorn.modules.system.service.SysUserService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

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

    @Override
    public BasicReturn<SysUser> addUser(SysUserVo sysUserVo) {
        SysUser sysUser = SysUserConvertMapper.INSTANCE.model2Entity(sysUserVo);
        sysUser.setId(UUID.fastUUID().getLeastSignificantBits());
        sysUser.setStatus("0");
        sysUserMapper.insert(sysUser);
        return BasicReturn.ok(sysUser);
    }

    @Override
    public boolean saveBatch(Collection<SysUser> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<SysUser> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<SysUser> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(SysUser entity) {
        return false;
    }

    @Override
    public SysUser getOne(Wrapper<SysUser> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<SysUser> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<SysUser> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<SysUser> getBaseMapper() {
        return null;
    }

    @Override
    public Class<SysUser> getEntityClass() {
        return null;
    }
}
