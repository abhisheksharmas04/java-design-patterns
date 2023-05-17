package com.ab.proxydp.example.test;

import java.util.Arrays;

import com.ab.proxydp.example.component.BankService;
import com.ab.proxydp.example.factory.BankServiceFactory;

public class Customer2 {
    public static void main(String[] args) {
        BankService service = BankServiceFactory.getInstance(false);
        System.out.println(service.withDraw(10001, 30000));
        System.out.println(service.withDraw(10001, 3000));

        System.out.println(Arrays.toString(service.getClass().getDeclaredMethods()));

    }
}
