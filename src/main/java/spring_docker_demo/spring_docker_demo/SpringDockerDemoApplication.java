package spring_docker_demo.spring_docker_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerDemoApplication {
	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome to spring docker demo";
	}
	@GetMapping("/show")
	public String showing()
	{
		return "executing docker container";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDemoApplication.class, args);
	}

}
