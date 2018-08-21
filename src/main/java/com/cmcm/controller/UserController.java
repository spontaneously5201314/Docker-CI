package com.cmcm.controller;

import com.cmcm.domain.User;
import com.cmcm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Spontaneously
 * @time 2018-08-21 上午11:10
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    @ResponseBody
    public String saveUser(@RequestParam(value = "name") String userName, @RequestParam(value = "age") int age) {
        User user = new User();
        user.setUserName(userName);
        user.setAge(age);
        Long userId = userService.saveUser(user);
        user.setId(userId);
        return user.toString();
    }

    @DeleteMapping("/delete/{id}")
    public int delete(@PathVariable(value = "id") Long id) {
        return userService.deleteUser(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public String update(@RequestParam(value = "id") Long id, @RequestParam(value = "name", required = false) String userName, @RequestParam(value = "age", required = false) int age) {
        User user = userService.findUserById(id);
        if (user == null) {
            user = new User();
            user.setUserName(userName);
            user.setAge(age);
            userService.saveUser(user);
        } else {
            user.setUserName(userName);
            user.setAge(age);
            userService.updateUser(user);
        }
        return user.toString();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public String find(@PathVariable(value = "id") Long id) {
        User user = userService.findUserById(id);
        return user != null ? user.toString() : "没有查到数据";
    }

    @GetMapping("/test/{word}")
    public String test(@PathVariable(value = "word") String word) {
        return word;
    }
}
