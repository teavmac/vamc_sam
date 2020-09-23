package com.teavamc.vamcsam;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@MapperScan("com.teavamc.vamcsam.dao")
@SpringBootApplication
public class VamcSamApplication {

    public static void main(String[] args) {
        SpringApplication.run(VamcSamApplication.class, args);
        log.info("Every thing will perfect!");
    }

}