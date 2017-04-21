package com.LibraryObjects;

import com.LibraryCatalogue.StudentI;

import javax.ejb.Remote;

/**
 * Created by DANCO on 04/04/2017.
 */
@Remote
public class Student extends User implements StudentI {
    public void BorrowBook() {
        Book book = new Book();
        book.getTitle();

    }

    public void LogIn(String Username,int Password) {

        if(getName().equals(Username)&&getID()==Password){
            System.out.println("YOU WERE LOGGED IN SUCCESSFULLY");
        }
        else{
            LogIn(Username,Password);
        }


    }

    public void PayFine(int Days,int Money) {
        if(Days>getDays()){
            Money=getMoney()*Days;
            System.out.println(Money);
        }


    }
}
