package com.mehmet.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//Entity scan anotasyonu tablo oluşturulması için önemli.

@SpringBootApplication
@EntityScan(basePackages = {"com.mehmet"})
@ComponentScan(basePackages = {"com.mehmet"})
@EnableJpaRepositories(basePackages = {"com.mehmet"})
public class SpringDataJpaApplication {
//Bu paketin adını starter olarak değiştirdim.
	//test second commit
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
