package cn.microboat.unicorn.modules.system.domain;

import lombok.Data;

/**
 * 系统用户表
 *
 * @author zhouwei
 */
@Data
public class SysUser {

    private String id;

    private String username;

    private String password;

}
