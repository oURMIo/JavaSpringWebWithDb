package com.example.demo.web;

import com.example.demo.database.UseForUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    UseForUser users;

    @GetMapping("/create")
    public String index(@PathVariable String id) {
        if (id.equals("dima")) {
            return "THE BEST! AND I KNOW IT(❁´◡`❁)";
        } else return "is the good!";
    }

    @GetMapping("*")
    public String index2() {
        String time = "\n"
                + "   ALL USERS   - "
                + "\n"
                + users.findAll();
        return time;
    }
}