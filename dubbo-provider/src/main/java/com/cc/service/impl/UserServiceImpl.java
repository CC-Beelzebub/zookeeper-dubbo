package com.cc.service.impl;

import com.cc.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**IUserService
 * Created by lenovo on 2018/3/13.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public boolean login(String username, String password) {
        logger.info("用户登录：[username:{}, password:{}]", username, password);
        if (username != null && password != null && username.equals(password)) {
            logger.info("用户校验通过。[username:{}]", username);
            return true;
        }
        logger.info("用户校验失败！[username:{}]", username);
        return false;
    }

    public static void main(String[] args){
        IUserService userService = new UserServiceImpl();
        userService.login("cc","111");
    }
}
