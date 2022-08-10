package com.testdemo.service;

import java.util.List;

import com.testdemo.model.Country;

public interface CountryService {
	
	public List<Country> getAllCountry(String countryCode,String countryName);

}
