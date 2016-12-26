package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Country;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CountryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addcountry(Country country) {
		System.out.println("calling adddata in dao...");
		Session session=sessionFactory.openSession();
		session.save(country);
		/*Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();*/
	}
	
	@Transactional
	public List getalldata(Country country) {
		
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Country.class);
		List list=criteria.list();
		return list;
		
	}

	

	@Transactional
	public void deleteCountry(Country country) {
		int id=country.getId();
		Session session = this.sessionFactory.openSession();
		Country p = (Country) session.load(Country.class,id);
		
			session.delete(p);
		
		
	}


}
