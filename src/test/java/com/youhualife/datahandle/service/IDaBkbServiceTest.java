package com.youhualife.datahandle.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class IDaBkbServiceTest {
    @Autowired
    private IDaBkbService daBkbService;

    @Test
    public void queryOccList() {
        int count = daBkbService.count();
        System.out.println("备考表数量为："+count);
    }

}