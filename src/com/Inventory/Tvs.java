package com.Inventory;

import javax.ejb.Stateless;
import java.util.ArrayList;
@Stateless(mappedName = "Television")
/**
 * Created by DANCO on 03/04/2017.
 */
public class Tvs extends com.Inventory.MainInventory {
    public String AddInventory() {

        ArrayList<Tvs> tv = new ArrayList<Tvs>();

     Tvs t = new Tvs();

        tv.add(t);
        return "ADDED";
    }
}

