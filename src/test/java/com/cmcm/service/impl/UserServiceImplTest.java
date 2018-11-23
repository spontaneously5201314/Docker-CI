//package com.cmcm.service.impl;
//
//import com.cmcm.domain.User;
//import com.cmcm.service.UserService;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
////import org.junit.runner.RunWith;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * @author Spontaneously
// * @time 2018-08-22 下午5:34
// */
////@RunWith(SpringRunner.class)
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//class UserServiceImplTest {
//
//    @Autowired
//    private UserService userService;
//
//    @BeforeAll
//    private static void beforeTest(){
//        System.out.println("test has started");
//    }
//
//    @Test
//    void saveUser() {
//        User user = new User();
//        user.setUserName("hongfei");
//        user.setAge(10);
//        Long userId = userService.saveUser(user);
//        assertNotNull(userId, "插入失败");
//    }
//
//    @Test
//    void deleteUser() {
//    }
//
//    @Test
//    void updateUser() {
//    }
//
//    @Test
//    void findUserById() {
//    }
//
//}