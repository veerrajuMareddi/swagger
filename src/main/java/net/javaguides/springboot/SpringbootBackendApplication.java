package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableSwagger2
public class SpringbootBackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		//hii
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
      return builder.sources(SpringbootBackendApplication.class);
  }

}
