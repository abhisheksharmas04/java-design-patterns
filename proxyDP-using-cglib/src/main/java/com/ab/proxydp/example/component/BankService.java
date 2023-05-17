package com.ab.proxydp.example.component;

public class BankService {

    public String withDraw(long accountNo, double amounth) {
        return "Withdrawing amounth:: " + amounth + " from account number:: " + accountNo;
    }

}
