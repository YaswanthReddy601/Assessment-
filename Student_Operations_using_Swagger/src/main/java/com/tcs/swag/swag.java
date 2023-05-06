package com.tcs.swag;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
@Configuration
@EnableSwagger2
public class swag {
	@Bean
	public Docket dockmeth() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.tcs.controller"))
				.paths(PathSelectors.regex("/student.*"))
				.build()
				.useDefaultResponseMessages(true)
				.apiInfo(apiinfo());
	}
	 
	private ApiInfo apiinfo() {
		Contact cont = new Contact("ram","http://www.abccoom/xyz","ram123@gmail.com");
		return new ApiInfo("title","description","1.0v","url","name","licence","license url");
	}
}
