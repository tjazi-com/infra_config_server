package com.tjazi.infra.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerCoreApplication.class, args);
    }
}
