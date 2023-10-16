package csu.yang.bbladmin;

import csu.yang.bbladmin.entity.User;
import csu.yang.bbladmin.mapper.UserMapper;
import csu.yang.bbladmin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xin.altitude.cms.common.entity.AjaxResult;

@SpringBootTest
class BblAdminApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Test
    void testSelectById(){
        System.out.println(userMapper.getUserById(1));
    }
    @Test
    void testSelect(){
        System.out.println(userMapper.selectList(null));
    }
    @Test
    void testInsert(){
        User user = new User();
        user.setUserName("yang");
        user.setUserPwd("123456");
        int tag = userMapper.insert(user);
        if(tag == 1){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
    }
    @Test
    void testService(){
        long count = userService.count();
        System.out.println(count);
    }
    @Test
    void testAjax(){
        User user = userMapper.getUserById(1);
        System.out.println(AjaxResult.success(user));
    }
}
