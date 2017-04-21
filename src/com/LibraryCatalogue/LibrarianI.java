package com.LibraryCatalogue;

import com.LibraryObjects.Book;

/**
 * Created by DANCO on 04/04/2017.
 */
public interface LibrarianI {
    public void RegisterUser();
    public void Authentication();
    public  String CheckinBook(Book b);
    public int AddBook(Book b);
    public void EditBook();
    public void RemoveBook();
    public void IssueBook();
    public void SearchForBook();
    public void FineBook();

}
