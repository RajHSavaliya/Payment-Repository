package com.dt.payment;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController
public class PaymentController {
	
	
	@PostMapping("/payment/pay")
	@Transactional
	public void pay(@RequestParam double amount) {

	    if (amount > 5000) {
	        throw new RuntimeException("Payment Failed");
	    }

	   // paymentRepository.save(new Payment(amount));
	}

}
