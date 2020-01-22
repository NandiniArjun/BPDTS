/**
 * Copyright © 2020 Lhasa Limited
 * File created: 21/01/2020 by Nandini
 * Creator : Nandini
 * Version : $$Id$$
 */
package com.bpdts.rest.model;

/**
 * @author Nandini
 * @since 21/01/2020
 */
public class User
{
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String ipAddress;
	private Double latitude;
	private Double longitude;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getIpAddress()
	{
		return ipAddress;
	}

	public void setIpAddress(String ipAddress)
	{
		this.ipAddress = ipAddress;
	}

	public Double getLatitude()
	{
		return latitude;
	}

	public void setLatitude(Double latitude)
	{
		this.latitude = latitude;
	}

	public Double getLongitude()
	{
		return longitude;
	}

	public void setLongitude(Double longitude)
	{
		this.longitude = longitude;
	}
}
