package cn.microboat.unicorn.auth.controller;

import cn.microboat.api.system.model.LoginUser;
import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.common.security.service.TokenService;
import cn.microboat.unicorn.auth.model.LoginModel;
import cn.microboat.unicorn.auth.service.SysLoginService;
import cn.microboat.unicorn.modules.system.domain.SysUser;
import cn.microboat.unicorn.modules.system.domain.vo.SysUserVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author zhouwei
 */
@RestController
public class TokenController {

    @Resource
    private TokenService tokenService;

    @Resource
    private SysLoginService sysLoginService;

    /**
     * 登录
     *
     * @param loginModel 登录信息
     * */
    @PostMapping("/login")
    public BasicReturn<?> login(@RequestBody LoginModel loginModel) {
        LoginUser user = new LoginUser();
        SysUser sysUser = new SysUser();
        sysUser.setId(1000L);
        sysUser.setUsername("hahah");
        user.setSysUser(sysUser);
        return BasicReturn.ok(tokenService.createToken(user));
    }

    /**
     * 登出
     *
     * @param request servlet 请求
     * */
    @DeleteMapping("/logout")
    public BasicReturn<?> logout(HttpServletRequest request) {
        return BasicReturn.ok();
    }

    /**
     * 刷新令牌有效期
     *
     * @param request servlet 请求
     * */
    @PostMapping("/refresh")
    public BasicReturn<?> refresh(HttpServletRequest request) {
        return BasicReturn.ok();
    }

    /**
     * 注册
     *
     * @param sysUserVo 用户注册信息
     * */
    @PostMapping("/register")
    public BasicReturn<?> register(@RequestBody SysUserVo sysUserVo) {
        return sysLoginService.register(sysUserVo);
    }

    /**
     * 不分页查询所有系统用户
     *
     * @return BasicReturn List SysUser
     * */
    @GetMapping("/user/list")
    public BasicReturn<List<SysUser>> getAllUser() {
        return sysLoginService.getAllUser();
    }

    /**
     * 增加一个系统用户
     *
     * @param sysUserVo 用户传入参数
     *
     * @return BasicReturn SysUser
     * */
    @PostMapping("/user/add")
    public BasicReturn<SysUser> addUser(@RequestBody SysUserVo sysUserVo) {
        return sysLoginService.addSysUser(sysUserVo);
    }

}
