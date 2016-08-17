package cn.homjie.boot.start;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class Args {

	@Autowired
	public Args(ApplicationArguments args) {
		boolean debug = args.containsOption("debug");
		System.out.println("debug:" + debug);
		boolean run = args.containsOption("run");
		System.out.println("run:" + run);
		List<String> files = args.getNonOptionArgs();
		files.forEach(System.out::println);
		// if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
	}
}
