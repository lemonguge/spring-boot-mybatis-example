package cn.homjie.boot.start.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class Destroy implements DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("application exit..");
	}

}
