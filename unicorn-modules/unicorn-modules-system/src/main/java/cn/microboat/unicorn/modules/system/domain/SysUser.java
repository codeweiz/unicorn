package cn.microboat.unicorn.modules.system.domain;

import cn.microboat.common.core.domain.BasicEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 系统用户表
 *
 * @author zhouwei
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser extends BasicEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     * */
    private Long id;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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

    /**
     * 账号状态
     * 0 正常
     * 1 停用
     * */
    private String status;

    /**
     * 最后一次登录的 IP 地址
     * */
    private String lastLoginIp;

    /**
     * 最后一次登录时间
     * */
    private Date lastLoginDate;

}
