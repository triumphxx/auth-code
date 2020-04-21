package org.triumphxx.resourceserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * @author:triumphxx
 * @Date:2020/4/20
 * @Time:10:27 下午
 * @desc:Token配置类
 **/
@Configuration
public class AccessTokenConfig {


    /**
     * 1.这种方式是将Token保存在内存中
     * @return
     */
//    @Bean
//    TokenStore tokenStore(){
//        return new InMemoryTokenStore();
//    }

    /**
     * 2.将token保存到redis中
     */
//    @Autowired
//    RedisConnectionFactory redisConnectionFactory;
//    @Bean
//    TokenStore tokenStore() {
//        return new RedisTokenStore(redisConnectionFactory);
//    }

    /**
     * jwt生成字符串的时候需要的签名
     */
    private String SIGNING_KEY ="triumphxx";
    /**
     * 2.将Token保存到jwt中
     * @return
     */
    @Bean
    TokenStore tokenStore(){
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    /**
     * 实现将用户信息和 JWT 进行转换（将用户信息转为 jwt 字符串，或者从 jwt 字符串提取出用户信息）
     * @return
     */
    @Bean
    JwtAccessTokenConverter jwtAccessTokenConverter(){
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey(SIGNING_KEY);
        return converter;
    }
}
