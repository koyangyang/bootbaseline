package csu.yang.bbladmin;

import csu.yang.bbladmin.mapper.UserMapper;
import csu.yang.bbladmin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Test
    void testService(){
        long count = userService.count();
        System.out.println(count);
    }
}
