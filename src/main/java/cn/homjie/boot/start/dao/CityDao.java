/**
 *    Copyright 2015-2016 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package cn.homjie.boot.start.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.homjie.boot.start.domain.City;

/**
 * @author Eddú Meléndez
 */
@Component
public class CityDao {

	@Autowired
	private SqlSession sqlSession;

	public City selectCityById(long id) {
		// 完全限定名，将被直接查找并且找到即用
		return this.sqlSession.selectOne("CityMapper.selectCityById", id);
	}

	public List<City> selectAll() {
		return this.sqlSession.selectList("CityMapper.selectAllCity");
	}

	public long insertCity(City city) {
		return this.sqlSession.insert("CityMapper.insert", city);
	}

}
