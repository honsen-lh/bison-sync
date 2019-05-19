package com.leaderment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@EnableWebMvc
public class Swagger2 {

   @Bean
    public Docket registerApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("register")
        		.genericModelSubstitutes(DeferredResult.class).useDefaultResponseMessages(false).forCodeGeneration(true)
				.select().apis(RequestHandlerSelectors.basePackage("com.leaderment.handler"))
				.paths(PathSelectors.any()).build().apiInfo(registerInfo());
    }
    @Bean
    public Docket claimApi() {
    	 return new Docket(DocumentationType.SWAGGER_2).groupName("claim")
         		.genericModelSubstitutes(DeferredResult.class).useDefaultResponseMessages(false).forCodeGeneration(true)
 				.select().apis(RequestHandlerSelectors.basePackage("com.leaderment.claim.handler"))
 				.paths(PathSelectors.any()).build().apiInfo(claimInfo());
    }
    @Bean
    public Docket templateApi() {
    	 return new Docket(DocumentationType.SWAGGER_2).groupName("template")
         		.genericModelSubstitutes(DeferredResult.class).useDefaultResponseMessages(false).forCodeGeneration(true)
 				.select().apis(RequestHandlerSelectors.basePackage("com.leaderment.template.handler"))
 				.paths(PathSelectors.any()).build().apiInfo(templateInfo());
    }
    @Bean
    public Docket afterSalesApi() {
    	 return new Docket(DocumentationType.SWAGGER_2).groupName("afterSales")
         		.genericModelSubstitutes(DeferredResult.class).useDefaultResponseMessages(false).forCodeGeneration(true)
 				.select().apis(RequestHandlerSelectors.basePackage("com.leaderment.afterSales.handler"))
 				.paths(PathSelectors.any()).build().apiInfo(afterSalesInfo());
    }
    private ApiInfo registerInfo() {
        return new ApiInfoBuilder()
                .title("warranty RESTful APIs")
                .description("warranty RESTful APIs")
                .termsOfServiceUrl("http://www.honsen.com/")
                .contact("Honsen Lee")
                .version("1.0")
                .build();
    }
    private ApiInfo claimInfo() {
        return new ApiInfoBuilder()
                .title("claim模块")
                .version("1.0")
                .build();
    }
    private ApiInfo templateInfo() {
        return new ApiInfoBuilder()
                .title("template模块")
                .version("1.0")
                .build();
    }
    private ApiInfo afterSalesInfo() {
        return new ApiInfoBuilder()
                .title("afterSales模块")
                .version("1.0")
                .build();
    }
}