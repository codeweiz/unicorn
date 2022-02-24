package cn.microboat.common.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhouwei
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 创建者 */
    private String createBy;

    /** 创建时间 */
    private Date createTime;

    /** 更新者 */
    private String updateBy;

    /** 更新时间 */
    private Date updateTime;

    /**
     * 删除标志
     * 0 存在
     * 1 删除
     * */
    private short isDeleted;
}
