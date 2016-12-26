package org.arpit.java2blog.service;

import java.util.List;

import org.arpit.java2blog.dao.CountryDAO;
import org.arpit.java2blog.model.Country;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("countryService")
public class CountryService {

	@Autowired
	CountryDAO countryDao;
	
	
	public void addcountry(Country country) {
		System.out.println("calling addcountry in service....");
		countryDao.addcountry(country);
	}
	
	public List getalldata(Country country) {
		
		List list=countryDao.getalldata(country);
		return list;
		
	}
	
	
	public void deletedata(Country country) {
		countryDao.deleteCountry(country);
		
		
	}


}
