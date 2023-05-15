package com.ab.proxydp.example.proxy;

import com.ab.proxydp.example.component.BankServiceImpl;
import com.ab.proxydp.example.component.IBankService;

public class BankServiceProxyImpl implements IBankService {
    private IBankService real; // Proxy class should have a real object it is mandatory.

    public BankServiceProxyImpl() {
        real = new BankServiceImpl();
    }

    @Override
    public String withDraw(long accountNo, double amounth) {
        String message = null;
        if(amounth <= 4000){
            message = real.withDraw(accountNo, amounth);
        }else{
            message = real.withDraw(accountNo,4000);
            message = message + "(**** Only 4000 can be withdraw at a time during transitation period)";
        }
        return message;
    }

}

/*
if we dont take Proxy interface seperately.. then the proxy class should directly implements from proxy class.
 */
