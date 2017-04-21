package com.LibraryCatalogue;

/**
 * Created by DANCO on 04/04/2017.
 */
public interface StudentI {
    public void BorrowBook();
    public void LogIn(String Username,int Password);
    public void PayFine(int Days,int Money);
}
