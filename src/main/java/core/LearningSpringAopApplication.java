package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy // ini adalah kode annotation untuk mengaktifkan aop
@SpringBootApplication
public class LearningSpringAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringAopApplication.class, args);
	}

}
