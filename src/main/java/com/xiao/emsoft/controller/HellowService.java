package com.xiao.emsoft.controller;

import com.xiao.emsoft.controller.Hellow;
import com.xiao.emsoft.entry.MyTest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xhf
 * @Date: 2019-11-19 14:30
 * @Description:
 */
@RestController
public class HellowService implements Hellow {

    @Override
    public String sayhellow() {
        return "swager测试成功";
    }
}

