package cn.edu.aynu.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//开启缓存
@EnableCaching
public class PracApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracApplication.class, args);
    }

}
