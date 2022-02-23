package cn.microboat.common.core.constant;

/**
 * 返回状态码
 *
 * @author zhouwei
 */
public class HttpStatus {

    /**
     * 操作成功
     * */
    private static final int SUCCESS = 200;

    /**
     * 对象创建成功
     * */
    private static final int CREATED = 201;

    /**
     * 请求已经被接收
     * */
    private static final int ACCEPTED = 202;

    /**
     * 操作已经执行成功，但是没有返回数据
     * */
    private static final int NO_CONTENT = 204;

    /**
     * 资源已被移除
     * */
    private static final int MOVED_PERM = 301;

    /**
     * 重定向
     * */
    private static final int SEE_OTHER = 303;

    /**
     * 资源没有被修改
     * */
    private static final int NOT_MODIFIED = 304;

    /**
     * 参数列表错误（缺少，格式不匹配）
     * */
    private static final int BAD_REQUEST = 400;

    /**
     * 未授权
     */
    private static final int UNAUTHORIZED = 401;

    /**
     * 访问受限，授权过期
     */
    private static final int FORBIDDEN = 403;

    /**
     * 资源、服务未找到
     */
    private static final int NOT_FOUND = 404;

    /**
     * 不允许的 http 方法
     */
    private static final int BAD_METHOD = 405;

    /**
     * 资源冲突，或者资源被锁
     */
    private static final int CONFLICT = 409;

    /**
     * 不支持的数据，媒体类型
     */
    private static final int UNSUPPORTED_TYPE = 415;

    /**
     * 系统内部错误
     */
    private static final int ERROR = 500;

    /**
     * 接口未实现
     */
    private static final int NOT_IMPLEMENTED = 501;

}
