package cn.homjie.boot.start.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

// @Profile segregate parts of your application configuration and make it only available in certain environments. 
// ensure application.properties spring.profiles.active contain prd, otherwise not activated
@Profile("prd")

@Component
@ConfigurationProperties(prefix = "connection")
public class ConnectionProperties {

	private String url;

	private DBAuth auth;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public DBAuth getAuth() {
		return auth;
	}

	public void setAuth(DBAuth auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "ConnectionProperties [url=" + url + ", auth=" + auth + "]";
	}

}
