package com.LibraryObjects;

import com.LibraryCatalogue.LibrarianI;

import java.util.ArrayList;

/**
 * Created by DANCO on 04/04/2017.
 */

public class Librerian extends User implements LibrarianI {


    public void RegisterUser() {
        Student student = new Student();
        student.setName("DAN");
        student.setEmail("simiyudan@gmail.com");
        student.setID(1234);

    }

    public void Authentication() {


    }

    public String CheckinBook(Book T) {
        Book b = new Book();

        return b.Title;
    }
    ArrayList<Book> books = new ArrayList<Book>();
    public int AddBook(Book b) {
        books.add(b);
        return books.size();
    }

    public void EditBook() {

    }

    public void RemoveBook() {

    }

    public void IssueBook() {

    }

    public void SearchForBook() {

    }

    public void FineBook() {
        Student student = new Student();
        student.setDays(10);
        student.setMoney(100);

    }
}
