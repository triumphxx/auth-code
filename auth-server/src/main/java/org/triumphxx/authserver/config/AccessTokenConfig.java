package org.triumphxx.authserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * @author:triumphxx
 * @Date:2020/4/20
 * @Time:10:27 下午
 * @desc:Token配置类
 **/
@Configuration
public class AccessTokenConfig {
    @Bean
    TokenStore tokenStore(){
        return new InMemoryTokenStore();
    }
}
