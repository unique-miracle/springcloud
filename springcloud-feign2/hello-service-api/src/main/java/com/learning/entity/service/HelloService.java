package com.learning.entity.service;

import com.learning.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 为了同前面那个hello 接口区分开了，我们加了refactor前缀
 *
 */
@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping("/hello2")
    public String hello2();

    @RequestMapping("/hello3")
    public User printUser(@RequestBody User user);
}