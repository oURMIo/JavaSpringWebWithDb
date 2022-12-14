package com.example.demo.web;

import com.example.demo.database.UseForUser;
import com.example.demo.database.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebContent {
    private long id = 0;

    @Autowired
    UseForUser users;

    /* in usual db server it's working */
    @GetMapping("/create/{name}")
    public String indexMain(@PathVariable String name) {
        User user = new User();
        user.setId(id + 2);
        user.setName(name);
        users.save(user);
        id++;
        return "create and add user with name - " + name;
    }

    @GetMapping("/create")
    public String indexTest() {
        return " TEST access ";
    }

    @GetMapping("*")
    public String indexForAll() {
        String time = "\r\n"
                + "   ALL USERS   - "
                + "\r\n"
                + users.findAll();
        User user = new User();
        user.setId(id + 2);
        user.setName("name " + id);
        users.save(user);
        id++;
        return time;
    }
}