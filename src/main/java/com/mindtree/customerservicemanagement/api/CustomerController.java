package com.mindtree.customerservicemanagement.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.customerservicemanagement.model.Customer;
import com.mindtree.customerservicemanagement.service.CustomerService;

@RestController
@RequestMapping("/customer/order")
public class CustomerController {

	@Autowired
	private CustomerService customerservice;

	@Cacheable(value = "Customer", key = "#customerid")
	@GetMapping("/{customerid}")
	public Customer getCustomerDetails(@PathVariable long customerid) {
		System.out.println("Before");
		return customerservice.getCustomerDetails(customerid);
		//System.out.println("After");
	}

}
