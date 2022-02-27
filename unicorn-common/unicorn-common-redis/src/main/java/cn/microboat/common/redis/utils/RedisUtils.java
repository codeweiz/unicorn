package cn.microboat.common.redis.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author zhouwei
 */
@Component
public class RedisUtils {

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 获得所有的键集合
     * */
    public Collection<String> keys(final String pattern) {
        return redisTemplate.keys(pattern);
    }

    /**
     * 缓存基本的对象，T 可以是 Integer、String、实体类
     *
     * @param key 键
     * @param value 值
     * */
    public <T> void setCacheObject(final String key, final T value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 缓存的对象，T 可以是 Integer、String、实体类
     * 并设置过期时间
     *
     * @param key 键
     * @param value 值
     * @param timeout 离过期的时间
     * @param timeUnit 单位
     * */
    public <T> void setCacheObject(final String key, final T value, final Long timeout, final TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key, value, timeout, timeUnit);
    }

    /**
     * 缓存 List 数据
     *
     * @param key 键
     * @param list 被缓存的 List 数据
     *
     * @return long 缓存成功的数量
     * */
    public <T> long setCacheList(final String key, final List<T> list) {
        Long count = redisTemplate.opsForList().rightPushAll(key, list);
        return count == null ? 0 : count;
    }

    /**
     * 根据 key 获取对应的 value
     *
     * @param key 键
     *
     * @return T 值
     * */
    public <T> T getCacheObject(final String key) {
        ValueOperations<String, T> opsForValue = redisTemplate.opsForValue();
        return opsForValue.get(key);
    }

    /**
     * 获得缓存的 List 对象
     *
     * @param key 键
     *
     * @return List
     * */
    public <T> List<T> getCacheList(final String key) {
        return redisTemplate.opsForList().range(key, 0, -1);
    }



    /**
     * 对缓存中的 key 设置过期时间
     *
     * @param key 键
     * @param timeout 离过期的时间
     * @param timeUnit 单位
     * */
    public boolean expire(final String key, final long timeout, final TimeUnit timeUnit) {
        return redisTemplate.expire(key, timeout, timeUnit);
    }

    /**
     * 对缓存中的 key 设置过期时间，单位默认为 秒
     *
     * @param key 键
     * @param timeout 离过期的时间
     * */
    public boolean expire(final String key, final long timeout) {
        return redisTemplate.expire(key, timeout, TimeUnit.SECONDS);
    }

    /**
     * 获取对应 key 的过期时间
     *
     * @param key 键
     *
     * @return long 离过期的时间
     * */
    public long getExpire(final String key) {
        return redisTemplate.getExpire(key);
    }

    /**
     * 判断 key 是否存在
     *
     * @param key 键
     *
     * @return Boolean true存在、false不存在
     * */
    public Boolean hasKey(final String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 删除单个对象
     *
     * @param key 键
     *
     * @return Boolean true删除成功、false删除失败
     * */
    public Boolean deleteObject(final String key) {
        return redisTemplate.delete(key);
    }

    /**
     * 删除多个对象，对象用 Collection 封装
     *
     * @param collection 集合对象
     * */
    public long deleteObjet(final Collection collection) {
        return redisTemplate.delete(collection);
    }

}
