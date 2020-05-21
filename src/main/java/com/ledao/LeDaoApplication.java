package com.ledao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author lxz
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.ledao.project.*.*.mapper")
public class LeDaoApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(LeDaoApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  江苏乐道胡巴项目启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}