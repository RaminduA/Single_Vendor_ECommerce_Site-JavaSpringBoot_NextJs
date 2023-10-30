package com.martymart.controller;

import com.martymart.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/checkout")
public class CheckoutController {
    @Autowired
    private CheckoutService checkoutService;
}
