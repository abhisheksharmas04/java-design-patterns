package com.ab.proxydp.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.ab.proxydp.example.component.BankServiceImpl;
import com.ab.proxydp.example.component.IBankService;

public class ProxyHelper implements InvocationHandler{
    private IBankService real;
    

    public ProxyHelper() {
        System.out.println("0::Param constructor");
        real = new BankServiceImpl();
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnValue = null;
        if(method.getName().equalsIgnoreCase("withdraw")){
            if((Double) args[1] <= 4000){
                returnValue = method.invoke(real, args); // call the real method
            }else{
                args[1] = 4000;
                returnValue = method.invoke(real, args); // call the real method
                returnValue = returnValue+ " You cannot withdraw more than 4000 at a time";
            }
        }else{
            returnValue = method.invoke(real, args);
        }

        return returnValue;
    }
    
}
