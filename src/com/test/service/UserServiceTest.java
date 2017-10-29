package com.test.service;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.entity.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserServiceTest {
	
	@Resource
	private UserService userService;

	@Test
	public void testFind() {
		List<User> list = userService.find();
		
		for(User u:list) {
			System.out.println(u);
		}
	}

}
