package com.cmcm.service.impl;

import com.cmcm.dao.UserDao;
import com.cmcm.domain.User;
import com.cmcm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Spontaneously
 * @time 2018-08-21 上午11:06
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public Long saveUser(User user) {
        user.setCreated(new Date());
        return userDao.save(user);
    }

    @Override
    public int deleteUser(Long id) {
        return userDao.delete(id);
    }

    @Override
    public int updateUser(User user) {
        user.setModified(new Date());
        return userDao.update(user);
    }

    @Override
    public User findUserById(Long id) {
        return userDao.findUserById(id);
    }
}
