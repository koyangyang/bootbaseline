package csu.yang.bbluser;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "csu.yang")
@MapperScan("csu.yang.bbluser.mapper")
public class BblUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(BblUserApplication.class, args);
    }
}
