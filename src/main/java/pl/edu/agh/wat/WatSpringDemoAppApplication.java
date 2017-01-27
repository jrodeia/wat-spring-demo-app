package pl.edu.agh.wat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
//@EnableOAuth2Sso
@RestController
public class WatSpringDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WatSpringDemoAppApplication.class, args);
	}
}
