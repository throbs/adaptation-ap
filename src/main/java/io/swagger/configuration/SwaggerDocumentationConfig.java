package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T17:20:01.502+08:00")

//用@Configuration注解该类，等价于XML中配置beans；用@Bean标注方法等价于XML中配置bean
@Configuration			//Spring-Boot run入口函数启动后，会自动加载这个类里面的配置
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("nfvi")
            .description("No descripton provided 页面描述")
            .license("")
            .licenseUrl("")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
/**
 * apis(RequestHandlerSelectors.basePackage("io.swagger.api"))，
 * 这个包下面放的所有controller都会被添加进swagger2的UI界面里，实现API文档的在线自动长成。
 * 
 * **/
