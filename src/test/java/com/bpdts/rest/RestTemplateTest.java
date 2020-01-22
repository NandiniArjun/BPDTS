/**
 * Copyright © 2020 Lhasa Limited
 * File created: 22/01/2020 by Nandini
 * Creator : Nandini
 * Version : $$Id$$
 */
package com.bpdts.rest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bpdts.rest.model.User;
import com.bpdts.rest.service.APIServiceImpl;

/**
 * @author Nandini
 * @since 22/01/2020
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RestTemplateTest
{
	@Autowired
	private APIServiceImpl apiServices;

	@Test
	public void test_all_users() {
		List<User> users = apiServices.getAllUsers();
		Assert.assertEquals(users.size(), 1000);
	}

	@Test
	public void test_all_users_by_city() {
		List<User> users = apiServices.getAllUsersByCity("London");
		Assert.assertEquals(users.size(), 6);
	}

	@Test
	public void retrieve_user_by_id() {
		User user = apiServices.getAllUsersByID("135");
		Assert.assertEquals(user.getId(), "135");
		Assert.assertNull(user.getFirstName());
		Assert.assertNull(user.getLastName());
		Assert.assertEquals(user.getEmail(), "mboam3q@thetimes.co.uk");
		Assert.assertNull(user.getIpAddress());
		Assert.assertEquals(user.getLatitude(), Double.valueOf("-6.5115909"));
		Assert.assertEquals(user.getLongitude(), Double.valueOf("105.652983"));
	}
}
