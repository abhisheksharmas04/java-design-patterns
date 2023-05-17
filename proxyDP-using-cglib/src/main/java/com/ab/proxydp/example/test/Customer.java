package com.ab.proxydp.example.test;

import com.ab.proxydp.example.component.BankService;
import com.ab.proxydp.example.factory.BankServiceFactory;

public class Customer {
    public static void main(String[] args) {
        BankService service = BankServiceFactory.getInstance(true);
        System.out.println(service.withDraw(10001, 30000));
        System.out.println(service.withDraw(10001, 3000));
    }
}
