package com.example.BookShop;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookShopApplication.class, args);
	}

	@Bean
	public OpenAPI openAPI (@Value("Bookshop Application") String description,
							@Value("1.0")String version){
		return new OpenAPI()
				.info(new Info()
						.title("Bookshop Application API")
						.version(version)
						.description(description)
						.license(new License().name("Bookshop Application License")));
	}



}
