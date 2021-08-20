package com.reserve.bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BookzyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookzyApplication.class, args);
    }

}
