package cn.microboat.common.core.exception.file;


/**
 * 文件信息异常类
 * 
 * @author zhouwei
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
