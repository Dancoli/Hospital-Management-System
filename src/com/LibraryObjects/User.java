package com.LibraryObjects;

/**
 * Created by DANCO on 04/04/2017.
 */
public class User {




    public int getDays() {
        return Days;
    }

    public void setDays(int days) {
        Days = days;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    int Days;
    int Money;

    String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    int ID;
    String email;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
