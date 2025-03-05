package com.example.payment.controller;

import com.example.payment.service.StripeService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/stripe")
@CrossOrigin(origins = "http://localhost:3000")
public class StripeController {

    @Autowired
    private StripeService stripeService;

    @PostMapping("/create-payment-intent")
    public Map<String, Object> createPaymentIntent(@RequestParam Double amount) throws StripeException {
        return stripeService.createPaymentIntent(amount, "usd");
    }
}
