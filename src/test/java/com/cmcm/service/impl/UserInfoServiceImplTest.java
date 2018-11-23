package com.cmcm.service.impl;

import com.cmcm.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Spontaneously
 * @time 2018-08-24 下午6:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoServiceImplTest {

//    @Resource
//    UserInfoMapper userInfoMaper;

    @Resource
    private UserInfoService userInfoService;

    @Test
    public void demo() {
        userInfoService.demo();
    }

}