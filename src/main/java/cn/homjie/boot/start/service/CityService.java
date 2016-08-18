package cn.homjie.boot.start.service;

import java.util.List;

import cn.homjie.boot.start.domain.City;

public interface CityService {

	public void saveCity(City city);

	public City queryCityById(long id);

	public List<City> queryAll();

}
