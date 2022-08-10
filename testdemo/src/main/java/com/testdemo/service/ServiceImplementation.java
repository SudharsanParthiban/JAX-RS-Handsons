package com.testdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.testdemo.model.Country;
import com.testdemo.model.Response;
@Path("/countries")
@Produces(MediaType.APPLICATION_JSON)
public class ServiceImplementation implements CountryService  {
	
	static List<Country> countryList = new ArrayList<Country>();
	
	static {
		Country c1 = new Country("IN", "INDIA");
		countryList.add(c1);
		
		Country c2 = new Country("USA", "AMERICA");
		countryList.add(c2);
		
		Country c3 = new Country("JP", "JAPAN");
		countryList.add(c3);
		
		Country c4 = new Country("MA", "MALAYSIA");
		countryList.add(c4);
	}
	
	@GET
	@Path("/country")
	public List<Country> getCountryIndia(@PathParam("countryCode") String countryCode) {
		List<Country> resList = new ArrayList<Country>();
		for(Country ob : countryList) {
			if(ob.getCountryCode().equals(countryCode)) {
				resList.add(ob);
			}
		}
		return resList;
	}
	@GET
	@Path("/allcountries")
	public List<Country> getAllCountry(@PathParam("countryCode") String countryCode,@PathParam("countryName") String countryName) {
		// TODO Auto-generated method stub
		List<Country> resList = new ArrayList<Country>();
		for(Country ob : countryList) {
			resList.add(ob);
		}
		return resList;
	}
	
	@GET
	@Path("/allcountries/{countryCode}")
	public List<Country> getCountry(@PathParam("countryCode") String countryCode) {
		List<Country> resList = new ArrayList<Country>();
		for(Country ob : countryList) {
			if(ob.getCountryCode().equals(countryCode)) {
				resList.add(ob);
			}
		}
		return resList;
	}
	
	@DELETE
	@Path("/allcountries/{countryCode}")
	public Response getDelete(@PathParam("countryCode") String countryCode) {
		Response response = new Response();
		for(Country ob : countryList) {
			if(ob.getCountryCode().equals(countryCode))
				countryList.remove(countryCode);
		}
		response.setStatus(true);
		response.setMessage(countryCode);
		return response;
	}
	
	@POST
	@Path("/add")
	public Response addCountry(@PathParam("countryCode") Country c) {
		Response response = new Response();
		if (countryList.contains(c.getCountryCode())) {
			response.setStatus(false);
			response.setMessage("Country Already Exists");
			return response;
		}
		countryList.add(c);
		response.setStatus(true);
		response.setMessage("Country created successfully");
		return response;
		
	}
	

}
