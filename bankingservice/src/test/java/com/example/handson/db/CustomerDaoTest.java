package com.example.handson.db;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.handson.dao.CustomerDao;

@RunWith(SpringRunner.class)
@SpringBootTest()
class CustomerDaoTest {
	
	@Autowired
	private CustomerDao dao;

	@Test
	void test() {
		System.out.println(dao);
		try {
			dao.getCustomerProfiles();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
