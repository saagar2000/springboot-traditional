package org.mitre.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SpringBootWebSecurityConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication

@EnableWebSecurity
/*
 * @EnableAutoConfiguration(exclude ={SecurityFilterAutoConfiguration.class,
 * SpringBootWebSecurityConfiguration.class})

/*
 * public class SwaBootApplication {
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(SwaBootApplication.class, args); }
 * 
 * }
 */
@ImportResource("classpath*:servlet-context.xml")


public class SwaBootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static Class<SwaBootApplication> applicationClass = SwaBootApplication.class;
}

/*
 * @RestController class GreetingController {
 * 
 * @RequestMapping("/hello/{name}") String hello(@PathVariable String name) {
 * return "Hello, " + name + "!"; } }
 */

