package com.ms.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}

//Sample
/*
req/res http://localhost:8888/got-service/config

{
name: "got-service",
profiles: [
"config"
],
label: null,
version: "b34ac7b0afd913978a511b9b54144ac54d861bf4",
state: null,
propertySources: [
{
name: "file:///C:/Utils/git-config/got-service.properties",
source: {
game-of-thrones.no-of-kingdoms: "15"
}
}
]
}
 */
