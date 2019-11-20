package com.xiao.emsoft.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: xhf
 * @Date: 2019-11-19 14:14
 * @Description:
 */
@Api(tags = "swager测试")
public interface Hellow {
    @ApiOperation(value = "sayhellow", tags = "swager测试")
    @RequestMapping(method = RequestMethod.GET,path = "hello/word")
    String sayhellow();
//    @ApiOperation(value = "jpa基础测试", tags = "swager测试")
//    @RequestMapping(method = RequestMethod.GET ,path = "hello/jpa")



}
