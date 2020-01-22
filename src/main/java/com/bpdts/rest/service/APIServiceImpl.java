/**
 * Copyright © 2020 Lhasa Limited
 * File created: 22/01/2020 by Nandini
 * Creator : Nandini
 * Version : $$Id$$
 */
package com.bpdts.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpdts.rest.client.APIServicesClient;
import com.bpdts.rest.model.User;

/**
 * @author Nandini
 * @since 22/01/2020
 */
@Service
public class APIServiceImpl
{
	@Autowired
	private APIServicesClient apiServicesClient;

	public List<User> getAllUsers()
	{
		List<User> users = apiServicesClient.getAllUsers();
		return users;
	}

	public List<User> getAllUsersByCity(String city)
	{
		List<User> users = apiServicesClient.getAllUsersByCity(city);
		return users;
	}

	public User getAllUsersByID(String userID)
	{
		User users = apiServicesClient.getAllUsersByID(userID);
		return users;
	}
}
