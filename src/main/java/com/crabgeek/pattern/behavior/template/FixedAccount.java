package com.crabgeek.pattern.behavior.template;

public class FixedAccount extends Account{
    @Override
    protected String getAccountType() {
        return "一年定期";
    }

    @Override
    protected double getInterestRate() {
        return 0.0325D;
    }
}
