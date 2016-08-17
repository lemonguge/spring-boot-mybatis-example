package cn.homjie.boot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ApplicationRunner {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationRunner.class, args);
	}

}
