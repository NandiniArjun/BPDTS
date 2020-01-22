/**
 * Copyright © 2020 Lhasa Limited
 * File created: 21/01/2020 by Nandini
 * Creator : Nandini
 * Version : $$Id$$
 */
package com.bpdts.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bpdts.rest.client.APIServicesClient;
import com.bpdts.rest.model.User;
import com.bpdts.rest.service.APIServiceImpl;

/**
 * @author Nandini
 * @since 21/01/2020
 */
@RestController
public class BPDTSController
{
	@Autowired
	private APIServiceImpl apiServices;

	@RequestMapping(method = RequestMethod.GET, path = "/users", produces = "application/json")
	public List<User> getUsers()
	{
		return apiServices.getAllUsers();
	}

	@RequestMapping(method = RequestMethod.GET, path="/city/{city}/users", produces = "application/json")
	public List<User> getUsersByCity(@PathVariable("city") String city)
	{
		return apiServices.getAllUsersByCity(city);
	}

	@RequestMapping(method = RequestMethod.GET, path="/user/{id}", produces = "application/json")
	public User getUsersByID(@PathVariable("id") String userID)
	{
		return apiServices.getAllUsersByID(userID);
	}
}
