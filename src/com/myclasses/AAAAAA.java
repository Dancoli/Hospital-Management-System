package com.myclasses;

import javax.ejb.Remote;

/**
 * Created by DANCO on 31/03/2017.
 */
@Remote
public interface AAAAAA {

    public boolean widhdraw(int amount);

    public void deposit(int amount);

    public int getbalance();
}

