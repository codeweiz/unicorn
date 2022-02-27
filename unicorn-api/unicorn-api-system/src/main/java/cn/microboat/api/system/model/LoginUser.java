package cn.microboat.api.system.model;

import cn.microboat.unicorn.modules.system.domain.SysUser;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * 登录用户信息
 *
 * @author zhouwei
 */
@Data
public class LoginUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识
     * */
    private String token;

    /**
     * 用户ID
     * */
    private Long userId;

    /**
     * 用户名
     * */
    private String username;

    /**
     * 登录时间
     * */
    private Long loginTime;

    /**
     * 过期时间
     * */
    private Long expireTime;

    /**
     * 登录的 IP 地址
     * */
    private String ipaddr;

    /**
     * 权限列表
     * */
    private Set<String> permissions;

    /**
     * 角色列表
     * */
    private Set<String> roles;

    /**
     * 用户信息
     * */
    private SysUser sysUser;
}