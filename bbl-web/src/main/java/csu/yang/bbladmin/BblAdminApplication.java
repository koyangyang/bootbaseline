package csu.yang.bbladmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "csu.yang")
public class BblAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BblAdminApplication.class, args);
    }
}
