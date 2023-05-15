package com.ab.proxydp.example.factory;

import com.ab.proxydp.example.component.BankServiceImpl;
import com.ab.proxydp.example.component.IBankService;
import com.ab.proxydp.example.proxy.BankServiceProxyImpl;

public class BankServiceFactory {
    // Factory Pattern
    public static IBankService getInstance(boolean demonitisation){
        IBankService service = null;
        if(demonitisation){
            service = new BankServiceProxyImpl();
        }else{
            service = new BankServiceImpl();
        }
        return service;
    }
}
