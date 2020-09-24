package com.orioltristany.templates.springbootcommandlinetemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCommandlineTemplateApplication implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(SpringbootCommandlineTemplateApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCommandlineTemplateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("hello world");
    }
}
