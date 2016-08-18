package cn.homjie.boot.start.resources;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.homjie.boot.start.domain.City;
import cn.homjie.boot.start.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Resource
	private CityService cityService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public City queryById(@PathVariable long id) {
		return cityService.queryCityById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody City city) {
		cityService.saveCity(city);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<City> queryAll() {
		return cityService.queryAll();
	}
}
