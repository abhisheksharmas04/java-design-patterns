package com.ab.proxydp.example.factory;

import com.ab.proxydp.example.component.BankService;
import com.ab.proxydp.example.proxy.BankProxyHelper;

import net.sf.cglib.proxy.Enhancer;

/*CG-LIB library always develop as the sub class of the real class
 * this is the limitation of CG-LIB library.
 */

public class BankServiceFactory {
    // Factory Pattern
    public static BankService getInstance(boolean demonitisation) {
        BankService service = null;
        if (demonitisation) {
            service = (BankService) Enhancer.create(BankService.class, new BankProxyHelper());
            /*
             * Enhancer.create(BankServiceImpl.class, new BankProxyHelper());
             * this line will generates & give In-Memory proxy class object
             */
        } else {
            service = new BankService();
        }
        return service;
    }
}
