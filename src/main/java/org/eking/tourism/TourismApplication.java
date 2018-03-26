package org.eking.tourism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
public class TourismApplication {

	public static void main(String[] args) {
		System.out.println(123);
        System.err.println(4);
		SpringApplication.run(TourismApplication.class, args);
	}
}
