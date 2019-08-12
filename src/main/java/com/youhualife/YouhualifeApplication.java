package com.youhualife;
import com.youhualife.datahandle.management.HandleWork;
import com.youhualife.datahandle.service.IDaDahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

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
        work.Handle();
    }
}
