package com.n2014858052.main;

import com.n2014858052.main.domain.Basic;
import com.n2014858052.main.domain.Profile;
import com.n2014858052.main.repository.BasicRepository;
import com.n2014858052.main.repository.ProfileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(BasicRepository basicRepository, ProfileRepository profileRepository) {
		return (args) -> IntStream.rangeClosed(1, 3).forEach(index -> {
			basicRepository.save(Basic.builder()
					.title("홍길동" + index)
					.subTitle("CEO" + index)
					.email("hone@gmail.com" + index)
					.number("012-123-4567" + index)
					.build());
			profileRepository.save(Profile.builder()
					.sns("트위터" + index)
					.id("home" + index)
					.link("http://www.naver.com" + index)
					.time(LocalDateTime.now())
					.build());
		});
	}

}
