package com.wlb.liapiclientsdk;

import com.wlb.liapiclientsdk.client.LiApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * LiApi 客户端配置
 *
 * @author wlb
 */
@Configuration
@ConfigurationProperties("liapi.client")
@Data
@ComponentScan
public class LiApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public LiApiClient liApiClient() {
        return new LiApiClient(accessKey, secretKey);
    }

}
