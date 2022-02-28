package cn.microboat.common.log.aspect;

import cn.microboat.common.core.domain.BasicReturn;
import cn.microboat.common.log.annotation.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhouwei
 */
@Aspect
@Component
public class LogAspect {

    private static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 在 Before 之后，在 After 之前，可以拿到返回值
     * */
    @AfterReturning(pointcut = "@annotation(controllerLog)", returning = "jsonResult")
    public void doAfterReturning(JoinPoint joinPoint, Log controllerLog, BasicReturn jsonResult) {
       log.info("=========进入doAfterReturning=========");
       log.info("这是：{}", controllerLog.toString());
        Signature signature = joinPoint.getSignature();
        String declaringTypeName = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        log.info("进入{}包下的{}方法", declaringTypeName, methodName);
        Object[] args = joinPoint.getArgs();
        log.info("参数：{}", args);
        log.info("返回的结果：{}", jsonResult.toString());
        jsonResult.setData(null);
        log.info("数据清空了哦！");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        HttpServletRequest request = attributes.getRequest();
        StringBuffer url = request.getRequestURL();
        String ip = request.getRemoteAddr();
        log.info("请求的 url 为：{}，请求的 ip 为：{}", url, ip);
        log.info("结束。。。");
    }

}
