package com.example.handson.dao;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	private static Logger LOGGER = Logger.getLogger(CustomerDaoImpl.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public void getCustomerProfiles() throws Exception{
		if(LOGGER.isDebugEnabled()) {
			LOGGER.debug("Invoking dao to retrieve customer profile");
		}
		List<Map<String, Object>> result=jdbcTemplate.queryForList("SELECT * FROM RETAILBANK.CUSTOMER_PROFILE");
	    for (Map resultRow:result) {
	    	System.out.println(resultRow);
	    }
	}
}
