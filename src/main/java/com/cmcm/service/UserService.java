package com.cmcm.service;

import com.cmcm.domain.User;

/**
 * @author Spontaneously
 * @time 2018-08-21 上午11:06
 */
public interface UserService {

    Long saveUser(User user);

    int deleteUser(Long id);

    int updateUser(User user);

    User findUserById(Long id);
}
