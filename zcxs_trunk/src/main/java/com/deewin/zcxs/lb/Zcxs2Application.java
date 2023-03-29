package com.deewin.zcxs.lb;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author ：liubo
 * @description：TODO
 * @date ：2023/3/23 17:20
 */
@SpringBootApplication
@Slf4j
public class Zcxs2Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Zcxs2Application.class);
        Environment env=app.run(args).getEnvironment();
        String port=env.getProperty("server.port")+"";
        String path= env.getProperty("server.servlet.context-path")+"";
        log.info("启动成功！！");
        log.info("ZCXS_VERSION2.0地址: \thttp://127.0.0.1:{}{}",port,path);
    }
}
