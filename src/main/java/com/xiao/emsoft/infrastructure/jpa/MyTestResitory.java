package com.xiao.emsoft.infrastructure.jpa;

import com.xiao.emsoft.infrastructure.po.MyTestPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Auther: xhf
 * @Date: 2019-11-19 17:19
 * @Description:
 */
public interface MyTestResitory extends JpaRepository<MyTestPo, String>, JpaSpecificationExecutor<MyTestPo> {
}
