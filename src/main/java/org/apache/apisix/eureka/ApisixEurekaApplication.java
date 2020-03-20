package org.apache.apisix.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApisixEurekaApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(ApisixEurekaApplication.class, args);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
