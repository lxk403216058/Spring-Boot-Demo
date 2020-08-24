package com.huazi.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2 //开启Swagger2
public class SwaggerConfig {
    //可以多人协同开发
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }
    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("C");
    }
    @Bean
    public Docket docket(Environment environment){
        //设置要显示Swagger的环境
        Profiles profiles = Profiles.of("dev");
        //获取项目环境
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("lxk")
                //是否启用swagger如果为false，swagger不能在浏览器中访问
                .enable(flag)
                .select()
                //RequestHandlerSelectors,配置要扫描接口的方式
                //basePackage指定扫描包
                //any()扫描全部
                //none()不扫描
                //withClassAnnotation扫描类上的注解RequestHandlerSelectors.withClassAnnotation(RestController.class)
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                //过滤什么路径.paths(PathSelectors.ant("/lxk/**"))
                .build();
    }
    //配置SwaggerInfo信息

    private ApiInfo apiInfo(){
        Contact DEFAULT_CONTACT = new Contact("lxk", "http://localhost:8080/", "403216058@qq.com");
        return new ApiInfo(
                "Swagger-API文档",
                "you xi",
                "v1.0",
                "http://localhost:8080/",
                DEFAULT_CONTACT,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>());
    }
}
