package com.illud.crimestopper.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;

import com.illud.crimestopper.security.oauth2.AuthorizationHeaderUtil;
@Configuration
public class OAuth2InterceptedFeignConfiguration {

    @Bean(name = "oauth2RequestInterceptor")
    public RequestInterceptor getOAuth2RequestInterceptor(AuthorizationHeaderUtil authorizationHeaderUtil) {
        return new TokenRelayRequestInterceptor(authorizationHeaderUtil);
    }
}
