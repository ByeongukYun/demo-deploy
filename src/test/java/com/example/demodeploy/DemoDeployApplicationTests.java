package com.example.demodeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoDeployApplicationTests {

    @Test
    void contextLoads() {
        int a = 1 / 0;
        throw new RuntimeException(("Error occurred!"));
    }

}
