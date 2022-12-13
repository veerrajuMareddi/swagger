package net.javaguides.springboot.swagerCustomisation;

import java.io.ObjectInputStream.GetField;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getInfo())
				.select()
				.apis(RequestHandlerSelectors.any()) //-> here we can give required packages
				
				.paths(PathSelectors.any())//we can give our required  path like /employee/*
				.build();
		
	}
	@Bean
	public ApiInfo getInfo()
	{
		return new ApiInfo("Employee Documentation", "You can give url here", "By veerraj", "this is no 2", "this is no 2", "this is no 2", "");
		
	}

}
