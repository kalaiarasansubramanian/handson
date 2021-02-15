package com.example.handson;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.handson.dao.CustomerDao;

@Component
public class BankingServiceRestController {
	private static Logger LOGGER = Logger.getLogger(BankingServiceRestController.class);
	
	@Autowired
	CustomerDao dao;
	
	public void getCustomerProfiles() {
		if(LOGGER.isDebugEnabled()) {
			LOGGER.debug("Invoking dao to retrieve customer profile");
		}
		try {
			dao.getCustomerProfiles();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error(e);
		}
	}
}
