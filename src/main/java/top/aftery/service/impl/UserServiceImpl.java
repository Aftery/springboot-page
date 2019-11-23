package top.aftery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.aftery.entity.User;
import top.aftery.mapper.UserMapper;
import top.aftery.service.UserService;

import java.util.List;

/**
 * @Author Aftery
 * @Date 2019/11/23 19:56
 * @Version 1.0
 **/
@Service
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        List<User> users = userMapper.queryUserList();
        if (!users.isEmpty()) {
            return users;
        }
        return null;
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }
}
