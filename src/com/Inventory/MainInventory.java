package com.Inventory;

/**
 * Created by DANCO on 03/04/2017.
 */
public abstract class MainInventory {
    public int items;
    public String ProductName;
    public String ProductCategory;

    public int CountInventory(){


        return items;

    }
    public String AddInventory(){

        return ProductName;

    }
    public String RemoveInventory(){

        return ProductName;

    }
    public String UpdateInventory() {


      return ProductCategory;
    }
    public String FindInventory(){



        return ProductCategory;
    }
}
