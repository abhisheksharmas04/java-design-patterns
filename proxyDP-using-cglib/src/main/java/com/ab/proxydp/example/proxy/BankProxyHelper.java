package com.ab.proxydp.example.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class BankProxyHelper implements MethodInterceptor{
    // This class is not a proxy class. It is helper class havingadditional code to placed in Dynamically generated In-Memory proxy class.

    @Override
    public Object intercept(Object realObject, Method realMethod, Object[] realMethodArguments, MethodProxy proxyCode) throws Throwable {
        Object returnValue = null;
        if(realMethod.getName().equalsIgnoreCase("withDraw")){
            if((Double) realMethodArguments[1] <= 4000){
                returnValue = proxyCode.invokeSuper( realObject, realMethodArguments);
                // calling the real method
            }else{
                realMethodArguments[1] = 4000;
                returnValue = proxyCode.invokeSuper(realObject, realMethodArguments);
                // calling the real method
                returnValue = returnValue + " only RS. 4000 can be withdraw at max";
            }
        }
        return returnValue;
    }
    
}
