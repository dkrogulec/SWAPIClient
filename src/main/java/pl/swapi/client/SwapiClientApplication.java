package pl.swapi.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Daniel Krogulec
 */
@EnableFeignClients
@SpringBootApplication
public class SwapiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwapiClientApplication.class, args);
	}
}
