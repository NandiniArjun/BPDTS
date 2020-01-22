/**
 * Copyright © 2020 Lhasa Limited
 * File created: 21/01/2020 by Nandini
 * Creator : Nandini
 * Version : $$Id$$
 */
package com.bpdts.rest.client;

import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bpdts.rest.model.User;

/**
 * @author Nandini
 * @since 21/01/2020
 */
@Service
public class APIServicesClient
{
	public List<User> getAllUsers() {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<User>> response =
				restTemplate.exchange(
						"https://bpdts-test-app.herokuapp.com/users",
						HttpMethod.GET,
						null,
						new ParameterizedTypeReference<List<User>>() {
						});

		List<User> users = response.getBody();
		return users;
	}

	public List<User> getAllUsersByCity(String city) {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<User>> response =
				restTemplate.exchange(
						"https://bpdts-test-app.herokuapp.com/city/{city}/users",
						HttpMethod.GET,
						null,
						new ParameterizedTypeReference<List<User>>() {
						},
						city);

		List<User> users = response.getBody();
		return users;
	}

	public User getAllUsersByID(String userID) {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<User> response =
				restTemplate.exchange(
						"https://bpdts-test-app.herokuapp.com/user/{id}",
						HttpMethod.GET,
						null,
						User.class,
						userID);

		User user = response.getBody();
		return user;
	}
}
