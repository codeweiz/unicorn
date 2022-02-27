package cn.microboat.common.core.mapper;

import java.util.List;

/**
 * 这个接口约束了 传入参数 和 默认抽象方法
 * 通用基础接口
 *
 * @author zhouwei
 */
public interface IBaseMapper<M, E> {

    /**
     * 模型转实体
     *
     * @param model 模型
     * @return E
     * */
    E model2Entity(M model);

    /**
     * 实体转模型
     *
     * @param entity 模型
     * @return M
     * */
    M entity2Model(E entity);

    /**
     * 模型列表转实体列表
     *
     * @param models 模型列表
     * @return List E
     * */
    List<E> models2Entities(List<M> models);

    /**
     * 实体列表转模型列表
     *
     * @param entities 实体列表
     * @return List M
     * */
    List<M> entities2Models(List<E> entities);
}
