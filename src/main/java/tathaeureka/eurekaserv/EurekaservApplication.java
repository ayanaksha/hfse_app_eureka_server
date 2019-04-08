package tathaeureka.eurekaserv;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class EurekaservApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaservApplication.class, args);
	}

}
