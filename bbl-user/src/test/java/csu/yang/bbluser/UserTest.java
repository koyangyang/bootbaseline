package csu.yang.bbluser;

import csu.yang.bbluser.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    @Test
    void test(){
        User user = new User();
        user.setUserId(1);
        user.setUserName("Koyang");
        user.setUserPwd("123456");
        System.out.println(user);
    }
}
