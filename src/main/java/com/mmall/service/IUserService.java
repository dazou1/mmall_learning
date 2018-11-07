package com.mmall.service;

import com.mmall.common.ServiceResponse;
import com.mmall.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Author: dazou
 * @Description: 用户接口
 * @Date: Create in 23:39 2018/10/31
 */
public interface IUserService {
    ServiceResponse<User> login(String username, String password);

    ServiceResponse<String> register(User user);

    ServiceResponse<String> checkValid(String str, String type);

    ServiceResponse selectQuestion(String username);

    ServiceResponse<String> checkAnswer(String username, String question, String answer);

    ServiceResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    ServiceResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    ServiceResponse<User> updateInformation(User user);

    ServiceResponse<User> getInformation(Integer userId);
}
