package com.ww.pmp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig
{
	
	
	private static final String AUTHORIZATION = "Authorization";
	private static final String WW_RESOURCES_BASE_PACKAGE = "com.ww.pmp.controller";
	
    @Bean
    public Docket apiDocklet() 
    {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(WW_RESOURCES_BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }
    
    
    private ApiKey apiKey()
    {
    	return new ApiKey(AUTHORIZATION,AUTHORIZATION,"header");
    }
    

    private ApiInfo apiInfo()
    {
		/*
		 * ApiInfo apiInfo = new ApiInfo( "My Project's REST API",
		 * "This is a description of your API.", "version-1", "API TOS",
		 * "vr", "API License", "API License URL" );
		 */
        return new ApiInfoBuilder().title(AUTHORIZATION).description(AUTHORIZATION).contact(new Contact("VR","","vr@test.com")).build();
    }
}