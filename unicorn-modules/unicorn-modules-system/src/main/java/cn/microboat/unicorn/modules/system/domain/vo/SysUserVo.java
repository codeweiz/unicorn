package cn.microboat.unicorn.modules.system.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author zhouwei
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserVo {

    /**
     * 用户名
     * */
    private String username;

    /**
     * 密码
     * */
    private String password;

    /**
     * 出生日期
     * */
    private Date birthday;

    /**
     * 电子邮箱地址
     * */
    private String email;

    /**
     * 手机号码
     * */
    private String phone;

    /**
     * 性别
     * */
    private String gender;

    /**
     * 用户头像
     * */
    private String avatar;
}
