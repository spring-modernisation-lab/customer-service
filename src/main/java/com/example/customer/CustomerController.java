package com.example.customer;

import com.example.platform.security.SecurityHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customers")
    public String getCustomers() {
        return "Customers - security "
            + SecurityHelper.getSecurityVersion();
    }
}
