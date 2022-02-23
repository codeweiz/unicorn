package cn.microboat.common.core.domain;

import cn.microboat.common.core.constant.Constants;

import java.io.Serializable;

/**
 * @author zhouwei
 */
public class BasicReturn<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     * */
    private int code;

    /**
     * 返回消息
     * */
    private String msg;

    /**
     * 返回数据
     * */
    private T data;

    /**
     * 无参情况下，默认状态码为 200，消息和数据为空
     *
     * @return BasicReturn 返回数据
     * */
    public static <T> BasicReturn<T> ok() {
        return basicReturn(Constants.SUCCESS, null, null);
    }

    /**
     * 默认状态码为 200，消息为传入的参数，数据为空
     *
     * @param msg 返回消息
     *
     * @return BasicReturn 返回数据
     * */
    public static <T> BasicReturn<T> ok(String msg) {
        return basicReturn(Constants.SUCCESS, msg, null);
    }

    /**
     * 默认状态码为 200，数据为传入的参数，消息为空
     *
     * @param data 返回数据
     *
     * @return BasicReturn 返回数据
     * */
    public static <T> BasicReturn<T> ok(T data) {
        return basicReturn(Constants.SUCCESS, null, data);
    }

    /**
     * 默认状态码为 200，数据、消息为传入的参数
     *
     * @param msg 返回消息
     * @param data 返回数据
     *
     * @return BasicReturn 返回数据
     * */
    public static <T> BasicReturn<T> ok(String msg, T data) {
        return basicReturn(Constants.SUCCESS, msg, data);
    }

    /**
     * 默认状态码为 500，数据、消息为空
     *
     * @return BasicReturn 返回数据
     * */
    public static <T> BasicReturn<T> fail() {
        return basicReturn(Constants.FAIL, null, null);
    }

    /**
     * 默认状态码为 500，消息为传入的参数，数据为空
     *
     * @param msg 返回消息
     *
     * @return BasicReturn 返回数据
     * */
    public static <T> BasicReturn<T> fail(String msg) {
        return basicReturn(Constants.FAIL, msg, null);
    }

    /**
     * 默认状态码为 500，数据为传入的参数，消息为空
     *
     * @param data 返回数据
     *
     * @return BasicReturn 返回数据
     * */
    public static <T> BasicReturn<T> fail(T data) {
        return basicReturn(Constants.FAIL, null, data);
    }

    /**
     * 默认状态码为 500，数据、消息为传入的参数
     *
     * @param msg 返回消息
     * @param data 返回数据
     *
     * @return BasicReturn 返回数据
     * */
    public static <T> BasicReturn<T> fail(String msg, T data) {
        return basicReturn(Constants.FAIL, msg, data);
    }

    /**
     * 状态码、数据、消息为传入的参数
     *
     * @param code 返会状态码
     * @param msg 返回消息
     * @param data 返回数据
     *
     * @return BasicReturn 返回数据
     * */
    public static <T> BasicReturn<T> fail(int code, String msg, T data) {
        return basicReturn(code, msg, data);
    }

    /**
     * 公共返回方法
     *
     * @param code 返回状态码
     * @param msg 返回消息
     * @param data 返回数据
     *
     * @return BasicReturn 返回数据
     * */
    public static <T> BasicReturn<T> basicReturn(int code, String msg, T data) {
        BasicReturn<T> basicReturn = new BasicReturn<>();
        basicReturn.setCode(code);
        basicReturn.setData(data);
        basicReturn.setMsg(msg);
        return basicReturn;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
