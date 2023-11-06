package csu.yang.bbladmin;

import cn.hutool.core.io.file.FileReader;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HutoolTest {
    @Test
    void test(){
        System.out.println("hello world");
    }
    @Test
    void testFileRead(){
        FileReader fileReader = new FileReader("/Users/yang/Pictures/609184517cfac46189e097023a61edd8.jpeg");
        System.out.println(fileReader.readBytes());
    }
}
