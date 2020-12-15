package com.exam.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class IProgrammerProjectTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(IProgrammerProjectTest1Application.class, args);
	}

}
