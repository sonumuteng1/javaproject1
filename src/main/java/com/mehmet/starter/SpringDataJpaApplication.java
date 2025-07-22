package com.mehmet.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//Entity scan anotasyonu tablo oluşturulması için önemli.
@EntityScan(basePackages = "com.mehmet")
@SpringBootApplication
public class SpringDataJpaApplication {
//Bu paketin adını starter olarak değiştirdim.
	//test second commit
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
