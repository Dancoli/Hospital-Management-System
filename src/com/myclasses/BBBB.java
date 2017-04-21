package com.myclasses;

import javax.ejb.Stateful;

/**
 * Created by DANCO on 31/03/2017.
 */
@Stateful
public class BBBB implements AAAAAA {
    private int amount = 0;


    public boolean widhdraw(int amount) {
        if (amount <= this.amount) {
            this.amount -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void deposit(int amount) {
        this.amount+=amount;
    }

    public int getbalance() {
        return amount;
    }
}
