package com.xiao.emsoft.infrastructure.jpa.impl;

import com.xiao.emsoft.domain.repository.MyTestRepo;
import com.xiao.emsoft.infrastructure.jpa.MyTestResitory;
import com.xiao.emsoft.infrastructure.po.MyTestPo;
import org.springframework.stereotype.Repository;

/**
 * @Auther: xhf
 * @Date: 2019-11-19 17:22
 * @Description:
 */
@Repository
public class MyTestResitoryjpa implements MyTestRepo {
    private final MyTestResitory myTestResitory;

    public MyTestResitoryjpa(MyTestResitory myTestResitory) {
        this.myTestResitory = myTestResitory;
    }

    @Override
    public void test() {
        MyTestPo po=new MyTestPo();
        po.setChannelType("00001");
        po.setCheckDate("2019-11-19");
        po.setCheckTotal(Long.parseLong("111"));
        po.setFailTotal(Long.parseLong("233"));
        po.setStatus(1);
        po.setTaskId("789215");
        po.setId("123456123456123456123456123456123456");
        myTestResitory.save(po);
    }
}
