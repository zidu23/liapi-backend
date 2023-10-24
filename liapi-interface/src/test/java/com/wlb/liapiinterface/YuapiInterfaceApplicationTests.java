package com.wlb.liapiinterface;

import com.wlb.liapiclientsdk.client.LiApiClient;
import com.wlb.liapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 * @author wlb
 */
@SpringBootTest
class LiapiInterfaceApplicationTests {

    @Resource
    private LiApiClient liApiClient;

    @Test
    void contextLoads() {
        String result = liApiClient.getNameByGet("lili");
        User user = new User();
        user.setUsername("lili");
        String usernameByPost = liApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
