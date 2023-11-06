package csu.yang.bbladmin;

import csu.yang.bbluser.entity.User;
import csu.yang.bbluser.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    @Test
    void contextLoads() {
        User user = new User();
        user.setUserId(1);
        user.setUserName("Koyang");
        user.setUserPwd("123456");
        System.out.println(user);
    }
    @Autowired
    private UserService userService;
    @Test
    void testService(){
        long count = userService.count();
        System.out.println(count);
    }
}
