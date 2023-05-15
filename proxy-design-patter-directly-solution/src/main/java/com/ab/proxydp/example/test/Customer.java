package com.ab.proxydp.example.test;

import com.ab.proxydp.example.component.IBankService;
import com.ab.proxydp.example.factory.BankServiceFactory;

public class Customer {
    public static void main(String[] args) {
        IBankService service = BankServiceFactory.getInstance(true);
        System.out.println(service.withDraw(10001, 30000));
        System.out.println(service.withDraw(10001, 3000));
    }
}
