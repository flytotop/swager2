package com.xiao.emsoft.infrastructure.po;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 * @Description 对账日志Po
 * @Auto xiaohangfeng
 * @DATA 2019/9/9 9:42
 */
@Data
@Accessors(chain = true)
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "MyTest", catalog = "")
public class MyTestPo {
    /**
     * 主键uuid
     */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @Column(name = "ID", nullable = false, length = 36)
    private String id;

    //渠道类型
    @Column(name = "CHANNEL_TYPE", nullable = true ,length = 5)
    private String channelType;

    //对账日期
    @Column(name = "CHECK_DATE", nullable = true ,length = 10)
    private String checkDate;

    //状态 0:未开始;1:对账中;2:对账完成 默认未为0
    @Column(name = "STATUS", nullable = true ,length = 1)
    private Integer status;

    //创建时间
    @Basic
    @CreatedDate
    @Column(name = "CREATE_TIME", nullable = true)
    private Date createTime;

    //更新时间
    @Basic
    @LastModifiedDate
    @Column(name = "UPDATE_TIME", nullable = true )
    private Date updateTime;

    //对账一致总数
    @Basic
    @Column(name = "CHECKTOTAL", nullable = false ,length = 8)
    private Long checkTotal;

    //对账不一致总数
    @Basic
    @Column(name = "FAILTOTAL", nullable = false ,length = 8)
    private Long failTotal;

    //对账成功总数
    @Basic
    @Column(name = "SUCCESSTOTAL", nullable = false ,length = 8)
    private Long successTotal;

    @Basic
    @Column(name = "TASK_ID", nullable = false ,length = 36)
    private String taskId;

}

