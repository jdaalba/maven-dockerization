package com.jdaalba.mavendockerization;

import static org.springframework.web.servlet.function.RequestPredicates.GET;
import static org.springframework.web.servlet.function.RouterFunctions.route;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@SpringBootApplication
public class MavenDockerizationApplication {

  private static final Logger log = LoggerFactory.getLogger("HelloController");

  public static void main(String[] args) {
    SpringApplication.run(MavenDockerizationApplication.class, args);
  }

  @Bean
  RouterFunction<ServerResponse> getEmployeeByIdRoute(@Value("${foo}") String foo) {
    log.info("Property foo is '{}'", foo);
    return route(GET("/hello"),
        req -> {
          final String name = req.param("name").orElse("World");
          log.info("Saying helo to '{}'", name);
          return ServerResponse.ok().body(Map.of("message", "Hello " + name + "!"));
        }
    );
  }
}
