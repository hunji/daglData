package com.youhualife;
import com.youhualife.datahandle.management.HandleWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.UUID;

/**
 * @author ZQ
 * springboot的一般处理程序
 * 把核心的操作放到了HandleWork的方法中
 */
@SpringBootApplication
public class YouhualifeApplication  implements CommandLineRunner {
    @Autowired
    private HandleWork work;

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(YouhualifeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(UUID.randomUUID());
//        File source = new File("E://1.png");
//        FileOutputStream target = new FileOutputStream("E://abc");
//        Files.copy(source.toPath(),target);
        work.Handle();
    }
}
