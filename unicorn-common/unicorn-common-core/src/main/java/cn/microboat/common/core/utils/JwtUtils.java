package cn.microboat.common.core.utils;

import cn.microboat.common.core.constant.SecurityConstants;
import cn.microboat.common.core.constant.TokenConstants;
import cn.microboat.common.core.text.TypeConverter;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Map;

/**
 * JsonWebToken 工具类
 *
 * @author zhouwei
 */
public class JwtUtils {

    public static String secret = TokenConstants.SECRET;

    /**
     * 从数据生命中生成 Token 令牌
     *
     * @param claims 数据声明
     *
     * @return String Token 令牌
     * */
    public static String createTokenByClaims(Map<String, Object> claims) {
        return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512, secret).compact();
    }

    /**
     * 从令牌Token中获取数据声明
     *
     * @param token 令牌
     *
     * @return Claims 数据声明
     * */
    public static Claims parseToken(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }

    /**
     * 根据令牌获取用户标识
     *
     * @param token 令牌
     * */
    public static String getUserKey(String token) {
        Claims claims = parseToken(token);
        return getValue(claims, SecurityConstants.USER_KEY);
    }

    /**
     * 根据数据声明获取用户标识
     *
     * @param claims 数据声明
     * */
    public static String getUserKey(Claims claims) {
        return getValue(claims, SecurityConstants.USER_KEY);
    }

    /**
     * 根据令牌 token 获取用户ID
     *
     * @param token 令牌
     *
     * @return String 用户ID
     * */
    public static String getUserId(String token) {
        Claims claims = parseToken(token);
        return getValue(claims, SecurityConstants.DETAILS_USER_ID);
    }

    /**
     * 根据数据声明 claims 获取用户ID
     *
     * @param claims 数据声明
     *
     * @return String 用户ID
     * */
    public static String getUserId(Claims claims) {
        return getValue(claims, SecurityConstants.DETAILS_USER_ID);
    }

    /**
     * 根据令牌 token 获取用户名
     *
     * @param token 令牌
     *
     * @return String 用户名
     * */
    public static String getUsername(String token) {
        Claims claims = parseToken(token);
        return getValue(claims, SecurityConstants.DETAILS_USERNAME);
    }

    /**
     * 根据数据声明 claims 获取用户名
     *
     * @param claims 数据声明
     *
     * @return String 用户名
     * */
    public static String getUsername(Claims claims) {
        return getValue(claims, SecurityConstants.DETAILS_USERNAME);
    }

    /**
     * 此类中的公共方法
     * 根据数据声明 claims 和 键 key 获取值
     *
     * @param claims 数据声明
     * @param key 键
     *
     * @return String 值
     * */
    public static String getValue(Claims claims, String key) {
        return TypeConverter.toStr(claims.get(key), "");
    }

}
