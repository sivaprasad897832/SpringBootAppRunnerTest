package com.app;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class MyAppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Set<String> opn=args.getOptionNames();
		System.out.println(opn);
		List<String> opv=args.getOptionValues("db");
		System.out.println(opv);
		List<String> nop=args.getNonOptionArgs();
		System.out.println(nop);
		String[] sa=args.getSourceArgs();
		System.out.println(sa);
	}

}
