package com.cmcm.service.impl;

import com.cmcm.dao.UserInfoMapper;
import com.cmcm.domain.UserInfo;
import com.cmcm.service.UserInfoService;
import groovy.util.logging.Slf4j;
import io.shardingjdbc.core.api.HintManager;
import io.shardingjdbc.core.hint.HintManagerHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Spontaneously
 * @time 2018-08-24 下午6:37
 */
@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    private static Long userId = 150L;

    @Override
    public void demo() {
        System.out.println("Insert--------------");
        for (int i = 1; i <= 10; i++) {
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(userId);
            userInfo.setAccount("Account" + i);
            userInfo.setPassword("pass" + i);
            userInfo.setUserName("name" + i);
            userId++;
            if (i == 3) {
                HintManagerHolder.clear();
                HintManager hintManager = HintManager.getInstance();
                hintManager.addDatabaseShardingValue("user_info", "user_id", 3L);
                hintManager.addTableShardingValue("user_info", "user_id", 3L);
                System.out.println(userId);
            }
            userInfoMapper.insert(userInfo);
        }
        System.out.println("over..........");
    }
}
