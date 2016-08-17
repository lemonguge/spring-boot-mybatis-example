package cn.homjie.boot.start;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

	public void run(String... args) {
		System.out.println(Arrays.toString(args));
		// Do something...
	}

}