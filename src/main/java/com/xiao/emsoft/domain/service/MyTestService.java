package com.xiao.emsoft.domain.service;

import com.xiao.emsoft.domain.repository.MyTestRepo;
import com.xiao.emsoft.infrastructure.jpa.MyTestResitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: xhf
 * @Date: 2019-11-19 18:09
 * @Description:
 */
@Service
public class MyTestService {
    private final MyTestRepo myTestRepo;

    @Autowired
    public MyTestService(MyTestRepo myTestRepo) {
        this.myTestRepo = myTestRepo;
    }

    public void test(){
        myTestRepo.test();
    }
}
