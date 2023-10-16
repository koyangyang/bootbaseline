package csu.yang.bbladmin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import csu.yang.bbladmin.entity.User;

public interface UserService extends IService<User> {
    //查找指定用户
    public User getUserByDetail(User user);
}
