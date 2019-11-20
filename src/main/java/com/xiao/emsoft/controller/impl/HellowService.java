package com.xiao.emsoft.controller.impl;

import com.xiao.emsoft.controller.Hellow;
import com.xiao.emsoft.domain.service.MyTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xhf
 * @Date: 2019-11-19 14:30
 * @Description:
 */
@RestController
public class HellowService implements Hellow {
    private final MyTestService myTestService;

    @Autowired
    public HellowService(MyTestService myTestService) {
        this.myTestService = myTestService;
    }

    @Override
    public String sayhellow() {
        myTestService.test();
        return "swager测试成功";
    }
}

