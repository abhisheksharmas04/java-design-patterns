package com.ab.proxydp.example.factory;

import java.lang.reflect.Proxy;

import com.ab.proxydp.example.component.BankServiceImpl;
import com.ab.proxydp.example.component.IBankService;
import com.ab.proxydp.example.proxy.ProxyHelper;

public class BankServiceFactory {
    // Factory Pattern
    public static IBankService getInstance(boolean demonitisation){
        IBankService service = null;
        if(demonitisation){
            service= (IBankService) Proxy.newProxyInstance(IBankService.class.getClassLoader(), new Class[]{IBankService.class}, new ProxyHelper());
        }else{
            service = new BankServiceImpl();
        }
        return service;
    }
}
