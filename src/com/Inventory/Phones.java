package com.Inventory;

import javax.ejb.Stateful;
import java.util.ArrayList;
@Stateful(mappedName = "Phones")
/**
 * Created by DANCO on 03/04/2017.
 */
public class Phones extends com.Inventory.MainInventory {

        @Override
        public String AddInventory() {

            ArrayList<Phones> PHONES = new ArrayList<Phones>();
                Phones d = new Phones();
                d.ProductName="DHHDHDH";
            PHONES.add(d);
            return ProductName;
        }

    }
