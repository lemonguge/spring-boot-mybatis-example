package cn.homjie.boot.start.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import cn.homjie.boot.start.dao.CityDao;
import cn.homjie.boot.start.domain.City;
import cn.homjie.boot.start.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private PlatformTransactionManager txmanager;

	@Autowired
	private CityDao cityDao;

	@Override
	@Transactional
	public void saveCity(City city) {
		System.out.println("txmanager=" + txmanager);
		this.cityDao.insertCity(city);
		System.out.println("id:" + city.getId());
	}

	@Override
	public City queryCityById(long id) {
		return cityDao.selectCityById(id);
	}

	@Override
	public List<City> queryAll() {
		return this.cityDao.selectAll();
	}

}
