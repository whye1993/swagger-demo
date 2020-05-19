package com.xu.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration  //配置类
@EnableSwagger2 //开启swagger2
public class SwaggerConfig {

    //配置swagger的信息，若未配置，就使用其默认配置
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("one")
                .apiInfo(apiInfo());
    }

    //apiInfo
    private ApiInfo apiInfo() {
        return new ApiInfo("这是标题",
                "这是描述",
                "这是版本v1.0",
                "https://www.bilibili.com/",//erms of service Url
                new Contact("名字","https://www.bilibili.com/","111111111@qq,com"),//作者信息
                "license",
                "https://www.bilibili.com/",
                new ArrayList()
        );
    }

}
