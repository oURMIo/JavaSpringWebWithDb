package com.example.demo;

import com.example.demo.database.UseForUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebWithDbApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WebWithDbApplication.class);
        app.run();
    }

    @Autowired
    UseForUser users;

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("%n ///// WORKING /////%n");
        System.out.println(users.findAll());
    }
}
