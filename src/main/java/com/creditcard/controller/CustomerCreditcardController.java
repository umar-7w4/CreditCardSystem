package com.creditcard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creditcard.entities.CreditCard;
import com.creditcard.entities.CustomerCreditCard;
import com.creditcard.service.CreditCardService;
import com.creditcard.service.CustomerCreditCardService;

@RestController
@RequestMapping("/api/customercreditcard")
public class CustomerCreditcardController {
	@Autowired
	CustomerCreditCardService customercreditcardService;
	
	 @PostMapping("/addcustomercreditcard")
	    public CustomerCreditCard addCustomerCreditcard(@RequestBody CustomerCreditCard customercreditcard){
	        return customercreditcardService.addCustomerCreditCard(customercreditcard);
	    }
	 
	 @GetMapping("/getcustomercreditcard")
	    public CustomerCreditCard getCreditcard(){
	        return customercreditcardService.getCustomerCreditCard();
	    }
	@GetMapping("/getcustomercreditcard/{number}")
	public ResponseEntity<CustomerCreditCard> getCustomerCreditcard(
			@PathVariable("customercreditcardNumber")Integer customercreditcardNumber){
		CustomerCreditCard customercreditcard= customercreditcardService.getCustomerCreditCardByNumber(customercreditcardNumber);
		if(customercreditcard==null) {
			return new ResponseEntity("Sorry! CustomerCreditcard not found!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<CustomerCreditCard>(customercreditcard, HttpStatus.OK);
	}
	
	
}
