package com.gogenie.customer.utility.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gogenie.customer.utility.exception.CustomerUtilityServiceException;

@RestController
public class CustomerUtilityController {

	@RequestMapping(value="/favorite", method=RequestMethod.PUT)
	public String addRestaurantAsFavorite(@RequestParam (value="restaurantId") Integer restaurantId, @RequestParam (value="customerId") Integer customerId) throws CustomerUtilityServiceException {
		return null;
	}

	@RequestMapping(value="/removefav", method=RequestMethod.PUT)
	public String removeRestaurantFromFavoriteList(@RequestParam (value="restaurantId") Integer restaurantId, @RequestParam (value="customerId") Integer customerId) {
		return null;
	}

}
