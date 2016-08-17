package cn.homjie.boot.start.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.stereotype.Component;

@Component
public class ServletInitialize implements ServletContextInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("Initialize, contextPath:" + servletContext.getContextPath());
	}

}
