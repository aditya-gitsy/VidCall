package com.aditya.videocall;

import com.alibou.videocall.user.User;
import com.alibou.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Adi")
							.email("ali@mail.com")
							.password("aaa")
					.build());

			service.register(User.builder()
					.username("Jokern")
					.email("joker@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Amy")
					.email("ammy@mail.com")
					.password("aaa")
					.build());
		};
	}

}
