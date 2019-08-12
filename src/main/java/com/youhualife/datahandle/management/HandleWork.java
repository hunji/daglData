package com.youhualife.datahandle.management;

import com.youhualife.datahandle.service.IDaDahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 核心操作类
 */
@Component
public class HandleWork {
    @Autowired
    private IDaDahService dahService;

    public void Handle(){
        // 1.0 导入历史数据（目前是从excel中读入到内存）--》之后可以定制从别的数据库中读取
        // 2.0 处理数据
        // 3.0 处理附件信息
        int count = dahService.count();
        System.out.println("handleWord 调用方法："+count);
    }

    public void HandleTest(){
        System.out.println("test");
    }
}
