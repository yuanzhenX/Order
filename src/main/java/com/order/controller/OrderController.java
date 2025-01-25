package com.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OrderController {

    @GetMapping("/customer")
    public String customerPage() {
        return "customer";
    }

    @GetMapping("/manager")
    public String managerPage() {
        return "manager";
    }

    @GetMapping("/deliver")
    public String deliverPage() {
        return "deliver";
    }



}