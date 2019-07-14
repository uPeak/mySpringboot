package cn.myfeng.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config.properties")
@MapperScan("cn.myfeng.springboot.mapper")
public class MySpingbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpingbootApplication.class);
    }

}
