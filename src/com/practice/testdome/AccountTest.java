package com.practice.testdome;

import org.junit.Assert;
import org.junit.Test;

import com.Testdome.Account;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        
        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }    
    
    @Test
    public void accountDepositCanNotBeNegative() {
        Account account = new Account(20);
        account.deposit(-3);
        Assert.assertEquals(0d, account.getBalance(), epsilon);
    }
    @Test
    public void accountCannotHaveNegativeWithdraw() {
        Account account = new Account(20);
        account.withdraw(-3);
        Assert.assertEquals(0d, account.getBalance(), epsilon);
    }
    @Test
    public void positiveDepositeOK() {
        Account account = new Account(20);
        account.deposit(3);
        Assert.assertEquals(3d, account.getBalance(), epsilon);
    }
    @Test
    public void withDrawwithinOverdraftlimitOK() {
        Account account = new Account(20);
        boolean result1=account.deposit(10);
        boolean result2=account.withdraw(13);
        Assert.assertEquals(-3d, account.getBalance(), epsilon);
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
    }
    @Test
    public void withDrawaboveOverdraftlimitNotOK() {
        Account account = new Account(20);
        account.withdraw(23);
        Assert.assertEquals(0d, account.getBalance(), epsilon);
    }
    
}