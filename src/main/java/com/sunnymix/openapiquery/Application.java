package com.sunnymix.openapiquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * @author sunnymix
 */
@SpringBootApplication(scanBasePackages = {"com.sunnymix.openapiquery"})
@ConfigurationPropertiesScan({"com.sunnymix.openapiquery"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
