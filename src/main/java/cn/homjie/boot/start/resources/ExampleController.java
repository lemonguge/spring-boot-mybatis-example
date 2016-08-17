package cn.homjie.boot.start.resources;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.homjie.boot.start.config.ConnectionProperties;
import cn.homjie.boot.start.dao.CityDao;
import cn.homjie.boot.start.mapper.HotelMapper;

@RestController
public class ExampleController {

	@Value("${name}")
	private String name;

	@Value("${my.secret}")
	private String secret;

	@Value("${app.description}")
	private String description;

	@Autowired
	private ConnectionProperties connectionProperties;

	@Autowired
	private CityDao cityDao;

	@Autowired
	private HotelMapper hotelMapper;

	@RequestMapping("/")
	String home() throws Exception {
		System.out.println("Hello! " + name + ", secret=" + secret + ", description:" + description);
		return "Hello World!";
	}

	@RequestMapping("/config")
	String config() {
		System.out.println(connectionProperties);
		return "Configuration";
	}

	@RequestMapping("/mapper")
	String mapper() {
		System.out.println(this.cityDao.selectCityById(1));
		System.out.println(this.hotelMapper.selectByCityId(1));
		return "Mapper";
	}

	@RequestMapping("/throw/{code}")
	String error(@PathVariable int code, HttpServletRequest request) {
		if (code == 1) {
			request.setAttribute("javax.servlet.error.status_code", 401);
			throw new AuthException();
		}
		return "Success";
	}

}