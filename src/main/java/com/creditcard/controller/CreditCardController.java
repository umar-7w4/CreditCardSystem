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
import com.creditcard.service.CreditCardService;

@RestController
@RequestMapping("/api/creditcard")
public class CreditCardController {
	
	@Autowired
	CreditCardService creditCardService;
	
	 @PostMapping("/addcreditcard")
	    public CreditCard addCreditcard(@RequestBody CreditCard creditcard){
	        return creditCardService.addCreditCard(creditcard);
	    }
	 
	 @GetMapping("/getAll")
	    public List<CreditCard> getCreditcards(){
	        return creditCardService.getCreditCardList();
	    }
	
	@GetMapping("/get/{cardName}")
	public ResponseEntity<CreditCard> getCreditcardByName(
			@PathVariable("cardName")String cardName){
		CreditCard creditcard= creditCardService.getCreditCardByName(cardName);
		if(creditcard==null) {
			return new ResponseEntity("Sorry! Creditcard not found!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<CreditCard>(creditcard, HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<CreditCard> getCreditcard(
			@PathVariable("id")Integer creditcardId){
		CreditCard creditcard= creditCardService.getCreditCardById(creditcardId);
		if(creditcard==null) {
			return new ResponseEntity("Sorry! Creditcard not found!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<CreditCard>(creditcard, HttpStatus.OK);
	}



	

}
