package csu.yang.bbluser.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import csu.yang.bbluser.entity.User;
import csu.yang.bbluser.mapper.UserMapper;
import csu.yang.bbluser.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    //查找指定用户
    @Override
    public User getUserByDetail(User user) {
        return baseMapper.selectOne(new QueryWrapper<User>()
                .eq("user_name", user.getUserName())
                .eq("user_pwd", user.getUserPwd()));
    }
}
